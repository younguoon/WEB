<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>GoldenCross</title>

</head>
<body>
	<div id="container" class="container">
		<h1><strong>GoldenCross</strong></h1>
		<div class="radio text-center">
		<form id="radioform">
			<h3>
				<c:choose>
					<c:when test="${mode==20}">
						<label class="radio-inline"><input  type="radio" name="mode" value=20 checked >5-20�� ���ũ�ν�(�ܱ�) </label>
						<label class="radio-inline"><input  type="radio" name="mode" value=60 >20-60�� ���ũ�ν�(�߱�)</label>
					</c:when>
					<c:otherwise>
						<label class="radio-inline"><input  type="radio" name="mode" value=20 >5-20�� ���ũ�ν�(�ܱ�)</label>
						<label class="radio-inline"><input  type="radio" name="mode" value=60 checked >20-60�� ���ũ�ν�(�߱�)</label>
					</c:otherwise>
				</c:choose>
			</h3>
			</form>
		</div>
		<div id="result_table" class="table-responsive">
			<table class="table table-hover">
				<thead>
				<tr class="info row">
					<th class="col-lg-1 text-center">��ȣ</th>
					<th class="col-lg-1 text-center">�����ڵ�</th>
					<th class="col-lg-2 text-center">�����</th>
					<!--<th class="col-md-1">��¥</th> -->
					<th class="col-lg-1 text-center">�ð�</th>
					<th class="col-lg-1 text-center">��</th>
					<th class="col-lg-1 text-center">����</th>
					<th class="col-lg-1 text-center">����</th>
					<th class="col-lg-1 text-center">�ŷ���</th>
					<th class="col-lg-1 text-center">�� �ֽ� ��</th>
					<th class="col-lg-1 text-center">���κ�����</th>
				</tr>
				<thead>
				<tbody>
				<c:forEach var="data" items="${resultlist}" varStatus="status">
					<tr class="row">
						<td class="text-center">${status.index+1}</td>
						<td class="text-center"><a href="/stock/stockchart.do?code=${data.code}"> ${data.code} </a></td>
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
	
	<footer class="container-fluid text-center">
  		<p>Footer Text</p>
	</footer>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('input:radio[name=mode]').change(function(){
			if (this.value == 20){
				var url ='http://localhost:8088/stock/goldencross.do?mode=20';
				$(location).attr('href',url);
			}else if(this.value == 60){
				var url ='http://localhost:8088/stock/goldencross.do?mode=60';
				$(location).attr('href',url);
			}
		});
		
	})

</script>
	
</body>
</html>