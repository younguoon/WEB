<%@page import="fundamental.dto.EpsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="fundamental.dto.EnterpriseTotalDTO"%>
<%@page import="fundamental.dto.EpsDTO"%>
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
			EpsDTO 				 eps 	 = (EpsDTO)request.getAttribute("eps");
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
			            text: 'WON'
			        },
			        height: 500,
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
			    	pointStart: Date.UTC(<%= Integer.toString(stockClose.get(0).getWeek()).substring(0,4)%>,
			   				<%= Integer.toString(stockClose.get(0).getWeek()).substring(4,6)%>,
		    				<%= Integer.parseInt(Integer.toString(stockClose.get(0).getWeek()).substring(6,7))*7%>),
			    	/* pointInterval: 24 * 3600 * 1000 // one day */
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '6PER',
			        data: [
			               <%=eps.getEps07y6()%>,<%=eps.getEps08y6()%>,<%=eps.getEps09y6()%>,<%=eps.getEps10y6()%>,
			               <%=eps.getEps11y6()%>,<%=eps.getEps12y6()%>,<%=eps.getEps13y6()%>,<%=eps.getEps14y6()%>,
			               <%=eps.getEps15y6()%>,<%=eps.getEps16y6()%>,<%=eps.getEps17y6()%>,<%=eps.getEps18y6()%>,
			               <%=eps.getEps19y6()%>,<%=eps.getEps20y6()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '9PER',
			        data: [
			               <%=eps.getEps07y9()%>,<%=eps.getEps08y9()%>,<%=eps.getEps09y9()%>,<%=eps.getEps10y9()%>,
			               <%=eps.getEps11y9()%>,<%=eps.getEps12y9()%>,<%=eps.getEps13y9()%>,<%=eps.getEps14y9()%>,
			               <%=eps.getEps15y9()%>,<%=eps.getEps16y9()%>,<%=eps.getEps17y9()%>,<%=eps.getEps18y9()%>,
			               <%=eps.getEps19y9()%>,<%=eps.getEps20y9()%>
			               
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '12PER',
			        data: [
			               <%=eps.getEps07y12()%>,<%=eps.getEps08y12()%>,<%=eps.getEps09y12()%>,<%=eps.getEps10y12()%>,
			               <%=eps.getEps11y12()%>,<%=eps.getEps12y12()%>,<%=eps.getEps13y12()%>,<%=eps.getEps14y12()%>,
			               <%=eps.getEps15y12()%>,<%=eps.getEps16y12()%>,<%=eps.getEps17y12()%>,<%=eps.getEps18y12()%>,
			               <%=eps.getEps19y12()%>,<%=eps.getEps20y12()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '16PER',
			        data: [
			               <%=eps.getEps07y16()%>,<%=eps.getEps08y16()%>,<%=eps.getEps09y16()%>,<%=eps.getEps10y16()%>,
			               <%=eps.getEps11y16()%>,<%=eps.getEps12y16()%>,<%=eps.getEps13y16()%>,<%=eps.getEps14y16()%>,
			               <%=eps.getEps15y16()%>,<%=eps.getEps16y16()%>,<%=eps.getEps17y16()%>,<%=eps.getEps18y16()%>,
			               <%=eps.getEps19y16()%>,<%=eps.getEps20y16()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '20PER',
			        data: [
			               <%=eps.getEps07y20()%>,<%=eps.getEps08y20()%>,<%=eps.getEps09y20()%>,<%=eps.getEps10y20()%>,
			               <%=eps.getEps11y20()%>,<%=eps.getEps12y20()%>,<%=eps.getEps13y20()%>,<%=eps.getEps14y20()%>,
			               <%=eps.getEps15y20()%>,<%=eps.getEps16y20()%>,<%=eps.getEps17y20()%>,<%=eps.getEps18y20()%>,
			               <%=eps.getEps19y20()%>,<%=eps.getEps20y20()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '30PER',
			        data: [
			               <%=eps.getEps07y30()%>,<%=eps.getEps08y20()%>,<%=eps.getEps09y30()%>,<%=eps.getEps10y30()%>,
			               <%=eps.getEps11y30()%>,<%=eps.getEps12y20()%>,<%=eps.getEps13y30()%>,<%=eps.getEps14y30()%>,
			               <%=eps.getEps15y30()%>,<%=eps.getEps16y30()%>,<%=eps.getEps17y30()%>,<%=eps.getEps18y30()%>,
			               <%=eps.getEps19y30()%>,<%=eps.getEps20y30()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '50PER',
			        data: [
			               <%=eps.getEps07y50()%>,<%=eps.getEps08y50()%>,<%=eps.getEps09y50()%>,<%=eps.getEps10y50()%>,
			               <%=eps.getEps11y50()%>,<%=eps.getEps12y50()%>,<%=eps.getEps13y50()%>,<%=eps.getEps14y50()%>,
			               <%=eps.getEps15y50()%>,<%=eps.getEps16y50()%>,<%=eps.getEps17y50()%>,<%=eps.getEps18y50()%>,
			               <%=eps.getEps19y50()%>,<%=eps.getEps20y50()%>
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    }]
			});
	});
		</script>
	</head>
	<body>
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>
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
              	<a href="perband.do?code=<%=dto.getCode()%>"> <%=dto.getName()%>(<%=dto.getCode()%>)</a>
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
                <small>   - PER Band</small>
              </h1>
              <%   }
          	  }
          	  %>
          	  
            <!-- <a class="btn btn-lg btn-primary " rows="2" style="float:right;margin-top:57px" id="search_button ">종목검색</a>
            <textarea style="float:right;margin-top:60px; " id="enterprise_search "></textarea>
             -->
            <div id="container" style="height: 580px; width: 100%; margin-top: 30px" >
          </div>
        </div>
      </div>
    </div>
<!-- pingendo end -->
	</body>
</html>
