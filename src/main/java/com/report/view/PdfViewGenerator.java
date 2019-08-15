package com.report.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.report.pojo.User;

public class PdfViewGenerator extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("content-disposition", "attachment; filename=\"users.pdf\"");
		
		@SuppressWarnings("unused")
		List<User> users=(List<User>) model.get("users");
		
		Paragraph p=new Paragraph("User Details");
		p.setAlignment(Element.ALIGN_CENTER);
	
		Table  table=new Table(3);
		table.addCell("Username");
		table.addCell("Email");
		table.addCell("Mobile");
		
		for(User u:users) {
			table.addCell(u.getUserName());
			table.addCell(u.getEmail());
			table.addCell(u.getMobile());
		}
		
		document.add(p);
		document.add(table);
	}
}