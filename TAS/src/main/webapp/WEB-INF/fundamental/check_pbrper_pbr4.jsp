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

	<h1 align="center">4 > PBR > 3</h1>
	<table class="table table-bordered" style="text-align:center;width:70%;height:1000px;overflow-y:scroll" cellspacing="10px" align="center">
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;">
				<a href="checkpbrper_pbr5.do">PBR > 4</a>
				<a href="checkpbrper_pbr4.do" style="padding-left: 70px">4 > PBR > 3</a>
				<a href="checkpbrper_pbr3.do" style="padding-left: 70px">3 > PBR > 2</a>
				<a href="checkpbrper_pbr2.do" style="padding-left: 70px">2 > PBR > 1</a>
				<a href="checkpbrper_pbr1.do" style="padding-left: 70px">1 > PBR</a>
			</th>
		</tr>
		
<!-- PBR 선택 -->		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 4 > PBR > 3 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;" >
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">BPS*2</th>
			<th style="text-align: center;">BPS*3</th>
			
		</tr>
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode4()!=null){ %>
		<tr>
			<td><a href="pbrband.do?code=<%=check.get(i).getCode4()%>"><%=check.get(i).getCode4()%></a></td>
			<td><a href="pbrband.do?code=<%=check.get(i).getCode4()%>"><%=check.get(i).getName4()%></a></td>
			<td><%=check.get(i).getWeek4()%></td>
			<td><%=check.get(i).getPrice4()%></td>
			<td><%=check.get(i).getBps4()%></td>
			<td><%=check.get(i).getEps4()%></td>
			<td><%=check.get(i).getBps4()*2%></td>
			<td><%=check.get(i).getBps4()*3%></td>
		</tr>  
		<% }} %>

	</table>
	
	
</body>
</html>