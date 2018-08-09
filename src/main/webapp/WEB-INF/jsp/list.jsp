<%@page import="com.dyb.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Book> list = (List<Book>) request.getAttribute("list");
	%>

	<%
		for (int i = 0; i < list.size(); i++) {
	%>
	<p><%=list.get(i).getName()%></p>
	<%
		}
	%>
</body>
</html>