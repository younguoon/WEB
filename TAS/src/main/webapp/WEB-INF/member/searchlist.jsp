<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,member.dto.*"%>
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
	<jsp:include page="search.jsp"/>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>���̵�</th><th>�н�����</th><th>����</th>
			<th>�ּ�</th><th>����Ʈ</th>
			<th>����</th>
		</tr>
		<%for(int i = 0;i<size;i++){
			MemberDTO user = userlist.get(i);%>
			<tr>
				<td><%= user.getId() %></td>
				<td><%= user.getPass() %></td>
				<td><%= user.getAddr()%></td>
				<td><%= user.getName() %></td>
				<td><%= user.getDeptno()%></td>
		<td><a href="/webtest/memberdelete.do?id=<%=user.getId() %>">����</a></td>
			</tr>
		<%} %>
	</table>
	
</body>
</html>










