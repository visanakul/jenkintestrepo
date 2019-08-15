<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<script type="text/javascript" language="javascript"
	src="//code.jquery.com/jquery-1.12.4.js">
	
</script>
<script type="text/javascript" language="javascript"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

</head>
<body>
	<table id="example" 
		class="table display dt-responsive nowrap table-bordered table-striped">
		<thead>
			<tr>
				<th>Username</th>
				<th>Email</th>
				<th>Mobile</th>
			</tr>
		</thead>
	</table>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$('#example').DataTable({
			"ajax" : "reports/table",
			"bPaginate":true,
			"aLengthMenu": [ [2, 4, 8, -1], [2, 4, 8, "All"] ],
			"iDisplayLength": 4	,
			"sAjaxDataProp":"",
			"columns" : [ {
				"mDataProp" : "userName"
			}, {
				"mDataProp" : "email"
			}, {
				"mDataProp" : "mobile"
			} ]
		});
	});
</script>
</html>