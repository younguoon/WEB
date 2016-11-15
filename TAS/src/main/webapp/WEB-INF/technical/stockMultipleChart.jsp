<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Highstock Example</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		<script type="text/javascript">
$(function() {
	var seriesOptions = [],
		yAxisOptions = [],
		seriesCounter = 0,
		names = ['END_PRICE', '5AVG', '20AVG','60AVG'],
		//names = ['MSFT', 'AAPL', 'GOOG'],
		colors = Highcharts.getOptions().colors;
	
	var dayList =[],
		endPriceList=[],
		fiveAvgList =[],
		twentyAvgList=[],
		sixtyAvgList=[];
	
	<c:forEach  var="movingAvg" items="${movingAvgList}">
		dayList.push("${movingAvg.getDay()}")
		endPriceList.push("${movingAvg.getEndPrice()}")
		if ("${movingAvg.getFiveAvg()!=0}"){
			fiveAvgList.push("${movingAvg.getFiveAvg()}")
			twentyAvgList.push("${movingAvg.getTwentyAvg()}")
			sixtyAvgList.push("${movingAvg.getSixtyAvg()}")

		}
	</c:forEach>
	
	var endPrice = [],
		fiveAvg=[],
		twentyAvg=[],
		sixtyAvg=[];
	
	for(var i =0; i<dayList.length;i++){
		endPrice.push([
						Date.UTC(dayList[i].substr(0,4),dayList[i].substr(4,2),dayList[i].substr(6,2)),
						Number(endPriceList[i])
		            ]);
		fiveAvg.push([
						Date.UTC(dayList[i].substr(0,4),dayList[i].substr(4,2),dayList[i].substr(6,2)),
						Number(fiveAvgList[i])
		            ]);
		twentyAvg.push([
						Date.UTC(dayList[i].substr(0,4),dayList[i].substr(4,2),dayList[i].substr(6,2)),
						Number(twentyAvgList[i])
		            ]);
		sixtyAvg.push([
						Date.UTC(dayList[i].substr(0,4),dayList[i].substr(4,2),dayList[i].substr(6,2)),
						Number(sixtyAvgList[i])
		            ]);
		
	}  

	var data =([
	            endPrice,
	            fiveAvg,
	            twentyAvg,
	            sixtyAvg
	            ]);
	
	for(var i =0; i<4;i++){
		seriesOptions[i] = {
				name: names[i],
				data: data[i]
			};
	}
	createChart();
	
	

	// create the chart when all data is loaded
	function createChart() {

		chart = new Highcharts.StockChart({
		    chart: {
		        renderTo: 'container'
		    },

		    rangeSelector: {
		        selected: 2
		    },
			
		    yAxis:{
		    	plotLines: [{
                    value: 0,
                    width: 2,
                    color: 'silver'
                }]
		    	
		    },
		   
		    
		    series: seriesOptions
		    		
		});
	}

});
		</script>
	</head>
	<body>
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>

<div id="container" style="height: 500px; min-width: 600px"></div>
	</body>
</html>
