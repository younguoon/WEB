<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, member.dto.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
	
<body>
<% List<MemberDTO> userlist  =
			(List<MemberDTO>)request.getAttribute("userlist"); 
	   int size = userlist.size();	%>
	<h1>ȸ�����(MVC)</h1>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th><spring:message code="member.form.id"/></th>
			<th><spring:message code="member.form.pass"/></th>
			<th><spring:message code="member.form.name"/></th>
			<th><spring:message code="member.form.addr"/></th>
			<th>�μ���ȣ</th>
			<th>����</th>
		</tr>
		<%for(int i = 0;i<size;i++){
			MemberDTO user = userlist.get(i);%>
			<tr>
				<td><a href ="memberread.do?id=<%= user.getId() %>&action='read'"><%= user.getId() %></a></td>
				<td><%= user.getPass() %></td>
				<td><%= user.getAddr()%></td>
				<td><%= user.getName() %></td>
				<td><%= user.getDeptno()%></td>
				<td>
				<a href="memberdelete.do?id=<%=user.getId() %>">����</a>
				</td>
			</tr>
		<%} %>
	</table>
	
</body>
</html>










