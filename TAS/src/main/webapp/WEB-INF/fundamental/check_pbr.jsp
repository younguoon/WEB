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

	<h1 align="center">PBR</h1>
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
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> PBR > 4 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">BPS*3</th>
			<th style="text-align: center;">BPS*4</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode5()!=null){ %>
		<tr>
			<td><a href="pbrband.do?code=<%=check.get(i).getCode5()%>"><%=check.get(i).getCode5()%></a></td>
			<td><a href="pbrband.do?code=<%=check.get(i).getCode5()%>"><%=check.get(i).getName5()%></a></td>
			<td><%=check.get(i).getWeek5()%></td>
			<td><%=check.get(i).getPrice5()%></td>
			<td><%=check.get(i).getBps5()%></td>
			<td><%=check.get(i).getEps5()%></td>
			<td><%=check.get(i).getBps5()*3%></td>
			<td><%=check.get(i).getBps5()*4%></td>
		</tr>  
		<% }} %>
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 3 < PBR <= 4 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">BPS*3</th>
			<th style="text-align: center;">BPS*4</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode4()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode4()%>"><%=check.get(i).getCode4()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode4()%>"><%=check.get(i).getName4()%></a></td>
			<td><%=check.get(i).getWeek4()%></td>
			<td><%=check.get(i).getPrice4()%></td>
			<td><%=check.get(i).getBps4()%></td>
			<td><%=check.get(i).getEps4()%></td>
			<td><%=check.get(i).getBps4()*3%></td>
			<td><%=check.get(i).getBps4()*4%></td>
		</tr>  
		<% }} %>
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 2 < PBR <= 3 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
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
		<%if(check.get(i).getCode3()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode3()%>"><%=check.get(i).getCode3()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode3()%>"><%=check.get(i).getName3()%></a></td>
			<td><%=check.get(i).getWeek3()%></td>
			<td><%=check.get(i).getPrice3()%></td>
			<td><%=check.get(i).getBps3()%></td>
			<td><%=check.get(i).getEps3()%></td>
			<td><%=check.get(i).getBps3()*2%></td>
			<td><%=check.get(i).getBps3()*3%></td>
		</tr>  
		<% }} %>		
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 1 < PBR <= 2 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
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
		<%if(check.get(i).getCode2()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode2()%>"><%=check.get(i).getCode2()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode2()%>"><%=check.get(i).getName2()%></a></td>
			<td><%=check.get(i).getWeek2()%></td>
			<td><%=check.get(i).getPrice2()%></td>
			<td><%=check.get(i).getBps2()%></td>
			<td><%=check.get(i).getEps2()%></td>
			<td><%=check.get(i).getBps2()*2%></td>
			<td><%=check.get(i).getBps2()*3%></td>
		</tr>  
		<% }} %>		
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> PBR < 1 </th>
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
		<%if(check.get(i).getCode1()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode1()%>"><%=check.get(i).getCode1()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode1()%>"><%=check.get(i).getName1()%></a></td>
			<td><%=check.get(i).getWeek1()%></td>
			<td><%=check.get(i).getPrice1()%></td>
			<td><%=check.get(i).getBps1()%></td>
			<td><%=check.get(i).getEps1()%></td>
			<td><%=check.get(i).getBps1()*2%></td>
			<td><%=check.get(i).getBps1()*3%></td>
		</tr>  
		<% }} %>

	</table>
	
<!----------------------------------------------------------------------------------------------------->
	<br/>
	<br/>
	<br/>
	<br/>
<!----------------------------------------------------------------------------------------------------->
	
			<h1 align="center">PER</h1>
	<table class="table table-bordered" style="text-align:center;width: 70%" align="center">
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> PER > 16 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">EPS*12</th>
			<th style="text-align: center;">EPS*16</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode17()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode17()%>"><%=check.get(i).getCode17()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode17()%>"><%=check.get(i).getName17()%></a></td>
			<td><%=check.get(i).getWeek17()%></td>
			<td><%=check.get(i).getPrice17()%></td>
			<td><%=check.get(i).getBps17()%></td>
			<td><%=check.get(i).getEps17()%></td>
			<td><%=check.get(i).getEps17()*12%></td>
			<td><%=check.get(i).getEps17()*16%></td>
		</tr>  
		<% }} %>
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 16 >= PER > 12 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">EPS*9</th>
			<th style="text-align: center;">EPS*12</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode16()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode16()%>"><%=check.get(i).getCode16()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode16()%>"><%=check.get(i).getName16()%></a></td>
			<td><%=check.get(i).getWeek16()%></td>
			<td><%=check.get(i).getPrice16()%></td>
			<td><%=check.get(i).getBps16()%></td>
			<td><%=check.get(i).getEps16()%></td>
			<td><%=check.get(i).getEps16()*9%></td>
			<td><%=check.get(i).getEps16()*12%></td>
		</tr>  
		<% }} %>
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 9 < PER <= 12 </th>
		</tr>
		<tr style="text-align: center; font-size: medium;">
			<th style="text-align: center;">종목코드</th>
			<th style="text-align: center;">종목명</th>
			<th style="text-align: center;">날짜(주)</th>
			<th style="text-align: center;">종가</th>
			<th style="text-align: center;">BPS</th>
			<th style="text-align: center;">EPS</th>
			<th style="text-align: center;">EPS*9</th>
			<th style="text-align: center;">EPS*12</th>
		</tr>		
		<% for(int i=0;i<check.size();i++){%>		
		<%if(check.get(i).getCode12()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode12()%>"><%=check.get(i).getCode12()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode12()%>"><%=check.get(i).getName12()%></a></td>
			<td><%=check.get(i).getWeek12()%></td>
			<td><%=check.get(i).getPrice12()%></td>
			<td><%=check.get(i).getBps12()%></td>
			<td><%=check.get(i).getEps12()%></td>
			<td><%=check.get(i).getEps12()*9%></td>
			<td><%=check.get(i).getEps12()*12%></td>
		</tr>  
		<% }} %>
		
		
		<tr>
			<th colspan="8" style="text-align: center;font-size:large;background-color:#f0f0f0;"> 6 < PER <= 9 </th>
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
		<%if(check.get(i).getCode9()!=null){ %>
		<tr>
			<td><a href="perband.do?code=<%=check.get(i).getCode9()%>"><%=check.get(i).getCode9()%></a></td>
			<td><a href="perband.do?code=<%=check.get(i).getCode9()%>"><%=check.get(i).getName9()%></a></td>
			<td><%=check.get(i).getWeek9()%></td>
			<td><%=check.get(i).getPrice9()%></td>
			<td><%=check.get(i).getBps9()%></td>
			<td><%=check.get(i).getEps9()%></td>
			<td><%=check.get(i).getEps9()*6%></td>
			<td><%=check.get(i).getEps9()*9%></td>
		</tr>  
		<% }} %>
		
		
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