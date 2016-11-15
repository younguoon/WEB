<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Highstock Example</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		<script type="text/javascript">
$(function() {
		var dayList =[]
		var endPriceList = []
		<c:forEach  var="stockInfo" items="${stockInfoList}">
			dayList.push("${stockInfo.getDay()}")
			endPriceList.push("${stockInfo.getEndPrice()}")
		</c:forEach>
			
		var endPrice = [];
		
		for(var i =0; i<dayList.length;i++){
			endPrice.push([
							Date.UTC(dayList[i].substr(0,4),dayList[i].substr(4,2),dayList[i].substr(6,2)),
							Number(endPriceList[i])
			            ]);
		}  


					
		// Create the chart
		window.chart = new Highcharts.StockChart({
			chart : {
				renderTo : 'container'
			},

			rangeSelector : {
				selected : 1
			},

			title : {
				text : ''
			},

			series : [{
				name : 'END_PRICE',
				data : endPrice,
				tooltip: {
                    valueDecimals: 2
                }
			}]
		});

});

		</script>
	</head>
	<body>
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>

<div id="container" style="height: 500px; min-width: 500px"></div>
	</body>
</html>