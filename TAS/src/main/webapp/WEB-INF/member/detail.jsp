<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%  MemberDTO user  =(MemberDTO)request.getAttribute("user");  	%>
	<div align="center">
	<form name="form" method="post" action="memberread.do">
		<table width="400" border="1">
			<tr>
				<td>ȸ�����̵�</td>
				<td><input type="text" name="id" value=<%=user.getId()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td>ȸ���н�����</td>
				<td><input type="text" name="pass" value=<%=user.getPass()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td>ȸ������</td>
				<td><input type="text" name="name" value=<%=user.getName()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td>ȸ���ּ�</td>
				<td><input type="text" name="addr" value=<%=user.getAddr()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td>ȸ���μ��ڵ�</td>
				<td><input type="text" name="deptno" value=<%=user.getDeptno()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td>���</td>
				<td><input type="text" name="grade" value=<%=user.getGrade()%> readonly="readonly"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�����ϱ�" onclick="location.href='memberread.do?id=<%=user.getId()%>&action=update'"/>
					<input type="button" value="�����ϱ�" onclick="location.href='delete.do?id=<%=user.getId()%>'"/>
					<input type="button" value="��Ϻ���" onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>









