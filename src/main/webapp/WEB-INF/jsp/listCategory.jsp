<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px; margin: 0px auto; text-align: center">
		<table align='center' border='1' cellspacing='0'>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>�༭</td>
				<td>ɾ��</td>
			</tr>
			<c:forEach items="${cs}" var="c" varStatus="st">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td><a href="category/${c.id}">�༭</a></td>
					<td>
						<form action="category/${c.id}" method="POST">
							<input type="hidden" name="_method" value="DELETE"> <input
								type="submit" value="delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div style="text-align: center">
			<a href="?start=0">�� ҳ</a> <a href="?start=${page.start-page.count}">��һҳ</a>
			<a href="?start=${page.start+page.count}">��һҳ</a> <a
				href="?start=${page.last}">ĩ ҳ</a>
		</div>

		<div style="text-align: center; margin-top: 40px">

			<form method="post" action="category">

				<input type="hidden" name="_method" value="PUT"> �������ƣ� <input
					name="name" value="" type="text"> <br> <br> <input
					type="submit" value="���ӷ���">
			</form>

		</div>
	</div>

	<form id="formdelete" action="" method="POST">
		<input type="hidden" name="_method" value="DELETE">
	</form>
</body>
</html>