<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE HTML>
<html>
<head>
<!--  calendar -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<!-- end calendar -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Bigdata</title>
<link rel="stylesheet" type="text/css" href="../jqcloud/jqcloud.css" />
<script src="resources/jqcloud/jqcloud-1.0.4.js"></script>
<link rel="stylesheet" href="resources/jqcloud/jqcloud.css">
<link
	href='http://fonts.googleapis.com/css?family=Droid+Serif|Open+Sans'
	rel='stylesheet' type='text/css'>

<style type="text/css">
.fa {
	display: inline-block;
	font: normal normal normal 14px/1 FontAwesome;
	font-size: inherit;
	text-rendering: auto;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	transform: translate(0, 0);
}

.btn-default {
	color: #333;
	background-color: #fff;
	border-color: #ccc;
}

.btn {
	display: inline-block;
	padding: 6px 12px;
	margin-bottom: 0;
	font-size: 14px;
	font-weight: 400;
	line-height: 1.42857143;
	text-align: center;
	white-space: nowrap;
	vertical-align: middle;
	-ms-touch-action: manipulation;
	touch-action: manipulation;
	cursor: pointer;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	background-image: none;
	border: 1px solid transparent;
	border-radius: 4px;
}

.fa-caret-square-o-right:before {
	content: "\f152";
}
</style>
</head>
<body>

	<div id="wrapper">




		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">WordCloud Analysis</h1>
			</div>

		</div>

		<div class="row">
			<div id="cloud_container" class="col-lg-9"
				style="text-align: center; max-height: 800px;">

				<div id="div_cloud"
					style="width: 850px; height: 550px; border: 1px solid #ccc;"></div>
			</div>

			<div class="col-lg-3">
				<form id="form_refresh" action="/snc" method="get">
					<div class="row">
						<div class="col-lg-6">
							<div class="panel panel-default">
								<div class="panel-heading">엔진</div>
								<div class="panel-body">

									<div class="radio">
										<c:choose>
											<c:when test="${mode==1}">

												<label> <input type="radio" name="mode" id="a2"
													value=1>뉴스가 많이 나온
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=2>산업
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=3>대형주
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=4>중형주
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=5>소형주
												</label>

											</c:when>
											<c:otherwise>
												<label> <input type="radio" name="mode" id="a2"
													value=1> 뉴스가 많이 나온
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=2>산업
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=3>대형주
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=4>중형주
												</label>
												<label> <input type="radio" name="mode" id="a2"
													value=5>소형주
												</label>
											</c:otherwise>
										</c:choose>

									</div>

								</div>
							</div>
						</div>
						<!-- start calendar -->
						<div>
							<script type:"txt/javascript">
						$(function(){
							$("#datepicker").datepicker({
							dateFormat:'yy-mm-dd'
							});
							
		
						});
						
						
						
							
						</script>
								<p>
									Date: <input type="text" id="datepicker">
								</p>

								<!-- end calendar -->
						</div>

					</div>
				</form>
			</div>

		</div>
	</div>




	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>
	<script type="text/javascript">


	var frequency_list1 = []
		<c:forEach var="data" items="${topiclist}" varStatus="status">
			var value =new Object();
			value.text="${data['NAME']}"
			value.weight=${data['NAMECOUNT']}
			frequency_list1.push(value)
			
		</c:forEach>
			
			 var frequency_list2 = []
			<c:forEach var="data" items="${industrylist}" varStatus="status">
				var value =new Object();
				value.text="${data['NAME']}"
				value.weight=${data['NAMECOUNT']}
				frequency_list2.push(value)
				
			</c:forEach>
				
			 var frequency_list3 = []
				<c:forEach var="data" items="${largelist}" varStatus="status">
					var value =new Object();
					value.text="${data['NAME']}"
					value.weight=${data['NAMECOUNT']}
					frequency_list3.push(value)
						
				</c:forEach>
				var frequency_list4 = []
					<c:forEach var="data" items="${mediumlist}" varStatus="status">
						var value =new Object();
						value.text="${data['NAME']}"
						value.weight=${data['NAMECOUNT']}
						frequency_list4.push(value)
							
					</c:forEach>
				var frequency_list5 = []
					<c:forEach var="data" items="${smalllist}" varStatus="status">
						var value =new Object();
						value.text="${data['NAME']}"
						value.weight=${data['NAMECOUNT']}
						frequency_list5.push(value)
								
					</c:forEach>
				
				
				
				 
				
				
			
			$(document).ready(function(){
			$('input:radio[name=mode]').change(function(){
				if(this.value==1){
					
					$(function() {
						 
						 $('#div_cloud').empty();
						$("#div_cloud").jQCloud(frequency_list1);
						 
					    
							 });
					   
							
								
							
				}else if(this.value==2){
					$(function() {
						
					      $('#div_cloud').empty();
					       $("#div_cloud").jQCloud(frequency_list2)});
						
							
						
				}else if(this.value==3){
					$(function() {
						
					      $('#div_cloud').empty();
					       $("#div_cloud").jQCloud(frequency_list3)});
						
							
						
				}else if(this.value==4){
					$(function() {
						
					      $('#div_cloud').empty();
					       $("#div_cloud").jQCloud(frequency_list4)});
						
							
						
				}else if(this.value==5){
					$(function() {
						
					      $('#div_cloud').empty();
					       $("#div_cloud").jQCloud(frequency_list5)});
						
							
						
				}
			});
			$('input:text').change(function(){
				var calendar=document.getElementById('datepicker').value;
				var url ='http://localhost:8088/stock/bigdata.do?ndate='+calendar;
				$(location).attr('href',url);
					
			});
			
			
			})
		
			
			    	   
 </script>

</body>
</html>
