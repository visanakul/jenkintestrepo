package com.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.report.pojo.User;
import com.report.service.IUserService;
import com.report.view.ExcelViewGenerator;
import com.report.view.PdfViewGenerator;

@Controller
public class DocumentController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/home")
	public String handleHomePage() {
		System.out.println("/home request")
		return "index";
	}

	@RequestMapping("/report")
	public ModelAndView handleDocDownload(@RequestParam(value = "type", required = false) String type,
			ModelAndView mv) {
		System.out.println("Type : " + type);

		if (type != null && type.equals("pdf")) {
			mv = new ModelAndView(new PdfViewGenerator(), "users", userService.getAllUsers());
			return mv;
		} else if (type != null && type.equals("excel")) {
			mv = new ModelAndView(new ExcelViewGenerator(), "users", userService.getAllUsers());
			return mv;
		} else {
			mv = new ModelAndView("user_reports", "users", userService.getAllUsers());
			return mv;
		}
	}

	@RequestMapping("/show")
	public String showJQueryTablePage() {
		return "jquery_table";
	}
	
	@RequestMapping("/reports/table")
	public @ResponseBody List<User> getUserData() {
		System.out.println("Sending : "+ userService.getAllUsers());
		return userService.getAllUsers();
	}
}
