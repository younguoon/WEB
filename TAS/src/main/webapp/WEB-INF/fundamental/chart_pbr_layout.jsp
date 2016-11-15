<%@page import="java.util.ArrayList"%>
<%@page import="fundamental.dto.EnterpriseTotalDTO"%>
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
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>PBR_BAND</title>
		
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		
		
		<script type="text/javascript">
		
		
		$(function() {
			
		   <%
		    List<StockCloseWDTO> stockClose = (List<StockCloseWDTO>)request.getAttribute("stockCloseList");
			EnterpriseFinanceDTO finance = (EnterpriseFinanceDTO)request.getAttribute("enterpriseFinance");
			BpsDTO 				 bps 	 = (BpsDTO)request.getAttribute("bps");
			List<EnterpriseTotalDTO> total = (List<EnterpriseTotalDTO>)request.getAttribute("codeList");
			List<StockCloseWDTO> closeList = (List<StockCloseWDTO>)request.getAttribute("closeList");
		   %>
		   
		    // create the chart
			$('#container').highcharts('StockChart', {
			    
			    rangeSelector: {
			        selected: 5
			    },
			    
			    title: {
			        text: ' ' 
			    },
				
			    yAxis: [{
			        title: {
			            text: '원'
			        },
			        /* yAxid:450, container:620px */
			        height: 430,
			        lineWidth: 1
			    }],
			    
			    series: [{
			        type: 'line',
			        name: 'END_PRICE',
			        data: [
			               <%for(int i=0;i<stockClose.size();i++){%>
			               <%=stockClose.get(i).getPrice()%>,
			               
			               <%}%>
			               ],
			    	pointStart: Date.UTC(
			    				<%= Integer.toString(stockClose.get(0).getWeek()).substring(0,4)%>,
				   				<%= Integer.toString(stockClose.get(0).getWeek()).substring(4,6)%>,
			    				<%= Integer.parseInt(Integer.toString(stockClose.get(0).getWeek()).substring(6,7))*7%>
			    						 ),
			    	/* pointInterval: 24 * 3600 * 1000 // one day */
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '0.4PBR',
			        data: [
			               <%=bps.getBps07y_04()%>,<%=bps.getBps08y_04()%>,<%=bps.getBps09y_04()%>,<%=bps.getBps10y_04()%>,<%=bps.getBps11y_04()%>,
			               <%=bps.getBps12y_04()%>,<%=bps.getBps13y_04()%>,<%=bps.getBps14y_04()%>,<%=bps.getBps15y_04()%>,<%=bps.getBps16y_04()%>,
			               <%=bps.getBps17y_04()%>,<%=bps.getBps18y_04()%>,<%=bps.getBps19y_04()%>,<%=bps.getBps20y_04()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '0.6PBR',
			        data: [
			               <%=bps.getBps07y_06()%>,<%=bps.getBps08y_06()%>,<%=bps.getBps09y_06()%>,<%=bps.getBps10y_06()%>,<%=bps.getBps11y_06()%>,
			               <%=bps.getBps12y_06()%>,<%=bps.getBps13y_06()%>,<%=bps.getBps14y_06()%>,<%=bps.getBps15y_06()%>,<%=bps.getBps16y_06()%>,
			               <%=bps.getBps17y_06()%>,<%=bps.getBps18y_06()%>,<%=bps.getBps19y_06()%>,<%=bps.getBps20y_06()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '0.8PBR',
			        data: [
			               <%=bps.getBps07y_08()%>,<%=bps.getBps08y_08()%>,<%=bps.getBps09y_08()%>,<%=bps.getBps10y_08()%>,<%=bps.getBps11y_08()%>,
			               <%=bps.getBps12y_08()%>,<%=bps.getBps13y_08()%>,<%=bps.getBps14y_08()%>,<%=bps.getBps15y_08()%>,<%=bps.getBps16y_08()%>,
			               <%=bps.getBps17y_08()%>,<%=bps.getBps18y_08()%>,<%=bps.getBps19y_08()%>,<%=bps.getBps20y_08()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '1PBR',
			        data: [
			               <%=bps.getBps07y()%>,<%=bps.getBps08y()%>,<%=bps.getBps09y()%>,<%=bps.getBps10y()%>,<%=bps.getBps11y()%>,
			               <%=bps.getBps12y()%>,<%=bps.getBps13y()%>,<%=bps.getBps14y()%>,<%=bps.getBps15y()%>,<%=bps.getBps16y()%>,
			               <%=bps.getBps17y()%>,<%=bps.getBps18y()%>,<%=bps.getBps19y()%>,<%=bps.getBps20y()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '2PBR',
			        data: [
			               <%=bps.getBps07y2()%>,<%=bps.getBps08y2()%>,<%=bps.getBps09y2()%>,<%=bps.getBps10y2()%>,<%=bps.getBps11y2()%>,
			               <%=bps.getBps12y2()%>,<%=bps.getBps13y2()%>,<%=bps.getBps14y2()%>,<%=bps.getBps15y2()%>,<%=bps.getBps16y2()%>,
			               <%=bps.getBps17y2()%>,<%=bps.getBps18y2()%>,<%=bps.getBps19y2()%>,<%=bps.getBps20y2()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '3PBR',
			        data: [
			               <%=bps.getBps07y3()%>,<%=bps.getBps08y3()%>,<%=bps.getBps09y3()%>,<%=bps.getBps10y3()%>,<%=bps.getBps11y3()%>,
			               <%=bps.getBps12y3()%>,<%=bps.getBps13y3()%>,<%=bps.getBps14y3()%>,<%=bps.getBps15y3()%>,<%=bps.getBps16y3()%>,
			               <%=bps.getBps17y3()%>,<%=bps.getBps18y3()%>,<%=bps.getBps19y3()%>,<%=bps.getBps20y3()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '4PBR',
			        data: [
			               <%=bps.getBps07y4()%>,<%=bps.getBps08y4()%>,<%=bps.getBps09y4()%>,<%=bps.getBps10y4()%>,<%=bps.getBps11y4()%>,
			               <%=bps.getBps12y4()%>,<%=bps.getBps13y4()%>,<%=bps.getBps14y4()%>,<%=bps.getBps15y4()%>,<%=bps.getBps16y4()%>,
			               <%=bps.getBps17y4()%>,<%=bps.getBps18y4()%>,<%=bps.getBps19y4()%>,<%=bps.getBps20y4()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    }]
			});
	});
		</script>
	</head>
	<body>

<!-- 차트 사용을 위한 API경로 -->
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>

<!-- HTML에 차트 삽입  -->
<!-- <div id="container" style="height: 700px; width: 1000px" ></div> -->

<!-- pingendo start -->
	  <!--전체 틀 -->
      <div class="container1" style="height:750px;width:100%">
        <div class="row" style="height:100%">
          <div class="col-md-2" style="height:100%">
            <ol style="height:700px;overflow-y:scroll; ">
              <%
              for(int j=0;j<total.size();j++){
            	  EnterpriseTotalDTO dto = new EnterpriseTotalDTO();
            	  dto = total.get(j);
              %>
              <li style="text-align:center;margin-top:5px;">
              	<a href="pbrband.do?code=<%=dto.getCode()%>"> <%=dto.getName()%>(<%=dto.getCode()%>)</a>
              </li>
			  <%
			  } 
			  %>
            </ol>
          </div>
          <div class="col-md-10" style="width:80%">
          	  
          	  <% 
          	  String name;
          	  String code;
          	  for(int i=0;i<total.size();i++){
          		  EnterpriseTotalDTO dto = new EnterpriseTotalDTO();
          		  dto=total.get(i);
          		  if(total.get(i).getCode().equals(stockClose.get(0).getCode())){
          			  
          	  %>
          	  
          	  <h1><%= total.get(i).getName()%>
                <small><%=total.get(i).getCode()%></small>
                <small>   - PBR Band</small>
              </h1>
              <%   }
          	  }
          	  %>
          	  
      <!--       <a class="btn btn-lg btn-primary " rows="2" style="float:right;margin-top:57px" id="search_button ">종목검색</a>
            <textarea style="float:right;margin-top:60px; " id="enterprise_search "></textarea> -->
            <div id="container" style="height: 580px; width: 100%; margin-top: 30px" >
          </div>
        </div>
      </div>
    </div>
<!-- pingendo end -->











	</body>
</html>
