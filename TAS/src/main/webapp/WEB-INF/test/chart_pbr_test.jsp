<%@page import="fundamental.dto.BpsDTO"%>
<%@page import="java.util.List"%>
<%@page import="fundamental.dto.StockCloseWDTO"%>
<%@page import="fundamental.dto.EnterpriseFinanceDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
<%

EnterpriseFinanceDTO finance = (EnterpriseFinanceDTO)request.getAttribute("enterpriseFinance");
List<StockCloseWDTO> close = (List<StockCloseWDTO>)request.getAttribute("stockCloselist");
BpsDTO bps = (BpsDTO)request.getAttribute("bpsData");
int closeSize = close.size();

%>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>PBR_BAND</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		<script type="text/javascript">

$(function() {
	var seriesOptions = [],
		yAxisOptions = [],
		seriesCounter = 0,
		names = ['END_PRICE', 'PBR_1', 'PBR_2','PBR_3','PBR_4'],
		//names = ['MSFT', 'AAPL', 'GOOG'],
		colors = Highcharts.getOptions().colors;
	
	var weekList =[],
		endPriceList=[];
		bps1List=[];
		bps2List=[];
		bps3List=[];
		bps4List=[];
		
	<c:forEach  var="bps" items="${bpsDataList}">
		bps1List.push("${bps.getBps06y(), bps.getBps07y(), bps.getBps08y(), bps.getBps09y(), bps.getBps10y(), bps.getBps11y(), bps.getBps12y(), bps.getBps13y(), bps.getBps14y(), bps.getBps15y(), bps.getBps16y(), bps.getBps17y(), bps.getBps18y(), bps.getBps19y()}")
		pbr2List.push("${bps.getBps06y2(),bps.getBps07y2(),bps.getBps08y2(),bps.getBps09y2(),bps.getBps10y2(),bps.getBps11y2(),bps.getBps12y2(),bps.getBps13y2(),bps.getBps14y2(),bps.getBps15y2(),bps.getBps16y2(),bps.getBps17y2(),bps.getBps18y2(),bps.getBps19y2()}")
		pbr3List.push("${bps.getBps06y3(),bps.getBps07y3(),bps.getBps08y3(),bps.getBps09y3(),bps.getBps10y3(),bps.getBps11y3(),bps.getBps12y3(),bps.getBps13y3(),bps.getBps14y3(),bps.getBps15y3(),bps.getBps16y3(),bps.getBps17y3(),bps.getBps18y3(),bps.getBps19y3()}")
		pbr4List.push("${bps.getBps06y4(),bps.getBps07y4(),bps.getBps08y4(),bps.getBps09y4(),bps.getBps10y4(),bps.getBps11y4(),bps.getBps12y4(),bps.getBps13y4(),bps.getBps14y4(),bps.getBps15y4(),bps.getBps16y4(),bps.getBps17y4(),bps.getBps18y4(),bps.getBps19y4()}")
	</c:forEach>
		
		
	<c:forEach  var="closeData" items="${closeDataList}">
		weekList.push("${movingAvg.getWeek()}")
		endPriceList.push("${movingAvg.getPrice()}")
	</c:forEach>
		
	var endPrice = [],
		bps1=[],
		bps2=[],
		bps3=[];
		bps4=[];
	
	for(var i =0; i<weekList.length;i++){
		endPrice.push([weekList[i],Number(endPriceList[i])]);
		bps1.push([weekList[i],Number(bps1List[i])]);
		bps2.push([weekList[i],Number(bps2List[i])]);
		bps3.push([weekList[i],Number(bps3List[i])]);
		bps4.push([weekList[i],Number(bps4List[i])]);
		}  

	var data =([
	            endPrice,
	            bps1,
	            bps2,
	            bps3,
	            bps4
	            ]);
	
	for(var i =0; i<5;i++){
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
pbrband
<div id="container" style="height: 500px; min-width: 600px"></div>
pbrband
	</body>
</html>
