<%@ page import="member.dto.MemberDTO"%>
<%@ page language="java"  contentType="text/html; charset=EUC-KR"  pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL�� �̿��� ȸ�� �˻�</h2>
	<jsp:include page="search.jsp"/>
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>���̵�</th><th>�н�����</th><th>����</th>
			<th>�ּ�</th><th>�μ���ȣ</th>
			<th>����</th>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id}</td>
				<td>${user.pass}</td>
				<td>${user.name}</td>
				<td>${user.addr}</td>
				<td>${user.deptno}</td>
				<td><a href="memberdel.do?id=${user.id}">����</a></td>
			
			</tr>			
		</c:forEach>
	</table>
	
</body>
</html>

