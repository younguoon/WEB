<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>RSI</title>
</head>
<body>
	<div id="container" class="container">
		<h1><strong>LOW RSI</strong></h1>
		<div class="radio text-center">
		<form id="radioform">
			<h3>
				<c:choose>
					<c:when test="${mode==7}">
						<label class="radio-inline"><input  type="radio" name="mode" value=7 checked >7일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=14 >14일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=21 >21일 RSI</label>
					</c:when>
					<c:when test="${mode==14}">
						<label class="radio-inline"><input  type="radio" name="mode" value=7 >7일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=14 checked>14일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=21 >21일 RSI</label>
					</c:when>
					<c:when test="${mode==21}">
						<label class="radio-inline"><input  type="radio" name="mode" value=7 >7일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=14 >14일 RSI</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=21 checked>21일 RSI</label>
					</c:when>
				</c:choose>
			</h3>
			</form>
		</div>
		<div id="result_table" class="table-responsive">
			<table class="table table-hover">
				<thead>
				<tr class="info row">
					<th class="col-lg-1 text-center">번호</th>
					<th class="col-lg-1 text-center">종목코드</th>
					<th class="col-lg-2 text-center">종목명</th>
					<!--<th class="col-md-1">날짜</th> -->
					<th class="col-lg-1 text-center">시가</th>
					<th class="col-lg-1 text-center">고가</th>
					<th class="col-lg-1 text-center">저가</th>
					<th class="col-lg-1 text-center">종가</th>
					<th class="col-lg-1 text-center">거래량</th>
					<th class="col-lg-1 text-center">총 주식 수</th>
					<th class="col-lg-1 text-center">외인보유율</th>
				</tr>
				<thead>
				<tbody>
				<c:forEach var="data" items="${resultlist}" varStatus="status">
					<tr class="row">
						<td class="text-center">${status.index+1}</td>
						<td class="text-center"><a href="/stock/stockchart.do?code=${data.code}">${data.code}</a></td>
						<td class="text-center"><a href="/stock/stockmultiplechart.do?code=${data.code}">${data.name}</a></td>
						<%-- <td>${data.day}</td> --%>
						<td class="text-center">${data.startPrice}</td>
						<td class="text-center">${data.highPrice}</td>
						<td class="text-center">${data.lowPrice}</td>
						<td class="text-center">${data.endPrice}</td>
						<td class="text-center">${data.volume}</td>
						<td class="text-center">${data.totalStock}</td>
						<td class="text-center">${data.foreigner}</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('input:radio[name=mode]').change(function(){
			if (this.value == 7){
				var url ='http://localhost:8088/stock/rsi.do?mode=7';
				$(location).attr('href',url);
			}else if(this.value == 14){
				var url ='http://localhost:8088/stock/rsi.do?mode=14';
				$(location).attr('href',url);
			}else if(this.value == 21){
				var url ='http://localhost:8088/stock/rsi.do?mode=21';
				$(location).attr('href',url);
			}
		});
		
	})

</script>
	
</body>
</html>