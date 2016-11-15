<%@page import="fundamental.dto.EnterpriseTotalDTO"%>
<%@page import="fundamental.dto.BpsDTO"%>
<%@page import="java.util.List"%>
<%@page import="fundamental.dto.CheckDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%List<CheckDTO> check = (List<CheckDTO>)request.getAttribute("closeCheck");%>

</head>
<body>
		<h1 align="center">6 > PER</h1>
	<table class="table table-bordered" style="text-align:center;width: 70%" align="center">
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;">
				<a href="checkpbrper_per5.do">PER > 16</a>
				<a href="checkpbrper_per4.do" style="padding-left: 70px">16 > PER > 12</a>
				<a href="checkpbrper_per3.do" style="padding-left: 70px">12 > PER > 9</a>
				<a href="checkpbrper_per2.do" style="padding-left: 70px">9 > PER > 6</a>
				<a href="checkpbrper_per1.do" style="padding-left: 70px">6 > PER</a>
			</th>
		</tr>
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;">  PER <6 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">EPS*6</th>
			<th style="text-align: center;">EPS*9</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode6()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode6()%>"><%=check.get(i).getCode6()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode6()%>"><%=check.get(i).getName6()%></a></td>
			<td><%=check.get(i).getWeek6()%></td>
			<td><%=check.get(i).getPrice6()%></td>
			<td><%=check.get(i).getBps6()%></td>
			<td><%=check.get(i).getEps6()%></td>
			<td><%=check.get(i).getEps6()*6%></td>
			<td><%=check.get(i).getEps6()*9%></td>
		</tr>  
		<% }} %>
		
	</table>
	
<!----------------------------------------------------------------------------------------------------->
	<br/>
	<br/>
	<br/>
	<br/>
<!----------------------------------------------------------------------------------------------------->
	
</body>
</html>