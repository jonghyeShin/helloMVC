<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>registerSuccess</title>
</head>
<body>
registerSuccess
<ul>
<li>Id : ${customer.id}</li>
<li>Password : ${customer.password}</li>
<li>Name : ${customer.name}</li>
<li>Gender : ${customer.gender}</li>
<li>Email : ${customer.email}</li>
</ul>

<form action="/helloMVC/index.jsp" method="get">
<input type="submit">
</form>
</body>
</html>