<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<script src="http://d3js.org/d3.v3.min.js"></script>
<script src="resources/js/d3.layout.cloud.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Bigdata</title>
<link rel="stylesheet" type="text/css" href="../jqcloud/jqcloud.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
<script src="resources/jqcloud/jqcloud-1.0.4.js"></script>
<link rel="stylesheet" href="resources/jqcloud/jqcloud.css">
<link href='http://fonts.googleapis.com/css?family=Droid+Serif|Open+Sans' rel='stylesheet' type='text/css'>
<script type="text/javascript">
var frequency_list = []
		<c:forEach var="data" items="${industrylist}" varStatus="status">
			var value =new Object();
			value.text="${data['INDUSTRYNAME']}"
			value.weight=${data['NAMECOUNT']}
			frequency_list.push(value)
			
		</c:forEach>
			
			
			$(function() {
			       // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
			       $("#div_cloud").jQCloud(frequency_list)});
			    	   
 </script>
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
				<h1 class="page-header">주식 WordCloud</h1>
			</div>
			
		</div>

		<div class="row">
			<div id="cloud_container" class="col-lg-9"
				style="text-align: center; max-height: 800px;">
				<!-- j3cloud div -->
				<!-- <div id="div_cloud"
					style="text-align: center; padding-bottom: 50px; max-height: 800px;"></div> -->
					<!--  j3cloud div end -->
					 <div id="div_cloud" style="width: 850px; height: 550px; border: 1px solid #ccc;"></div>
			</div>

			<div class="col-lg-3">
				<form id="form_refresh" action="/snc" method="get">
					<div class="row">
						<div class="col-lg-6">
							<div class="panel panel-default">
								<div class="panel-heading">엔진</div>
								<div class="panel-body">
									
									<div class="radio">
										<label> <input type="radio" name="engine" id="a2"
											value="topic"> 뉴스가 많이 나온
										</label>
									</div>
								
								</div>
							</div>
						</div>


					</div>
				</form>
			</div>
		</div>
	</div>
	<%-- <P>bigdata hello</P>
	<div id="container" class="container">
		<h1>
			<strong>Bigdata</strong>
		</h1>
		<div class="radio text-center">
			<form id="radioform">
				<h3>
					
						
							<label class="radio-inline"><input type="radio"
								name="news" value=1>뉴스에 많이 나온</label>
					
					
				</h3>
			</form>
		</div>
		<div id="result_table" class="table-responsive">
			<table class="table table-hover">
				<tr class="info row">
					<th class="col text-center">Stockname</th>
					<th class="col text-center">Count</th>
				</tr>
				<thead>
				<tbody>
				
					<c:forEach var="data" items="${topiclist}" varStatus="status">
						<tr class="row">
							
							<td class="text-center">${data.stockName }</td>
							<td class="text-center">${data.nameCount }</td>
							
						</tr>
					</c:forEach> 

				</tbody>
			</table>
		</div>
	</div> --%>
	

	<!-- <script type="text/javascript">
		$(document).ready(function() {
			$('input:radio').change(function() {

				var url = 'http://localhost:8088/stock/bigdata.do';
				$(location).attr('href', url);

			});

		})
		 -->
		
	</script>
	<script>
/* 	var jsonStr = 
		<c:forEach var="data" items="${topiclist}" varStatus="status">
			value.put("text","${data.put.stockName }")
			value.put("size","${data.put.nameCount }")
		</c:forEach>
		document.write(jsonSTr) */
		
	/* 	var frequency_list = []
		<c:forEach var="data" items="${topiclist}" varStatus="status">
			var value =new Object();
			value.text="${data['STOCKNAME']}"
			value.size="${data['NAMECOUNT']}"
			frequency_list.push(value)
		</c:forEach>
			$(function() {
			       // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
			       $("#example").jQCloud(frequency_list);
			     }); */
			/////jqcloud start////
	
			
		/////end jqcloud////	
		//document.write(value.keys())
		/* 
		 JSONObject json = new JSONObject();
		 json.putAll( value );
		 */ 
		
	
    //var frequency_list = [{"text":"study","size":40},{"text":"motion","size":15},{"text":"forces","size":10},{"text":"electricity","size":15},{"text":"movement","size":10},{"text":"relation","size":5},{"text":"things","size":10},{"text":"force","size":5},{"text":"ad","size":5},{"text":"energy","size":85},{"text":"living","size":5},{"text":"nonliving","size":5},{"text":"laws","size":15},{"text":"speed","size":45},{"text":"velocity","size":30},{"text":"define","size":5},{"text":"constraints","size":5},{"text":"universe","size":10},{"text":"physics","size":120},{"text":"describing","size":5},{"text":"matter","size":90},{"text":"physics-the","size":5},{"text":"world","size":10},{"text":"works","size":10},{"text":"science","size":70},{"text":"interactions","size":30},{"text":"studies","size":5},{"text":"properties","size":45},{"text":"nature","size":40},{"text":"branch","size":30},{"text":"concerned","size":25},{"text":"source","size":40},{"text":"google","size":10},{"text":"defintions","size":5},{"text":"two","size":15},{"text":"grouped","size":15},{"text":"traditional","size":15},{"text":"fields","size":15},{"text":"acoustics","size":15},{"text":"optics","size":15},{"text":"mechanics","size":20},{"text":"thermodynamics","size":15},{"text":"electromagnetism","size":15},{"text":"modern","size":15},{"text":"extensions","size":15},{"text":"thefreedictionary","size":15},{"text":"interaction","size":15},{"text":"org","size":25},{"text":"answers","size":5},{"text":"natural","size":15},{"text":"objects","size":5},{"text":"treats","size":10},{"text":"acting","size":5},{"text":"department","size":5},{"text":"gravitation","size":5},{"text":"heat","size":10},{"text":"light","size":10},{"text":"magnetism","size":10},{"text":"modify","size":5},{"text":"general","size":10},{"text":"bodies","size":5},{"text":"philosophy","size":5},{"text":"brainyquote","size":5},{"text":"words","size":5},{"text":"ph","size":5},{"text":"html","size":5},{"text":"lrl","size":5},{"text":"zgzmeylfwuy","size":5},{"text":"subject","size":5},{"text":"distinguished","size":5},{"text":"chemistry","size":5},{"text":"biology","size":5},{"text":"includes","size":5},{"text":"radiation","size":5},{"text":"sound","size":5},{"text":"structure","size":5},{"text":"atoms","size":5},{"text":"including","size":10},{"text":"atomic","size":10},{"text":"nuclear","size":10},{"text":"cryogenics","size":10},{"text":"solid-state","size":10},{"text":"particle","size":10},{"text":"plasma","size":10},{"text":"deals","size":5},{"text":"merriam-webster","size":5},{"text":"dictionary","size":10},{"text":"analysis","size":5},{"text":"conducted","size":5},{"text":"order","size":5},{"text":"understand","size":5},{"text":"behaves","size":5},{"text":"en","size":5},{"text":"wikipedia","size":5},{"text":"wiki","size":5},{"text":"physics-","size":5},{"text":"physical","size":5},{"text":"behaviour","size":5},{"text":"collinsdictionary","size":5},{"text":"english","size":5},{"text":"time","size":35},{"text":"distance","size":35},{"text":"wheels","size":5},{"text":"revelations","size":5},{"text":"minute","size":5},{"text":"acceleration","size":20},{"text":"torque","size":5},{"text":"wheel","size":5},{"text":"rotations","size":5},{"text":"resistance","size":5},{"text":"momentum","size":5},{"text":"measure","size":10},{"text":"direction","size":10},{"text":"car","size":5},{"text":"add","size":5},{"text":"traveled","size":5},{"text":"weight","size":5},{"text":"electrical","size":5},{"text":"power","size":5}];
	/* var frequency_list = ([
	                      {"text":"study","size":40},
	                      {"text":"study","size":40},
	                      
	                      ])
 */
 
 ///j3cloud start///
    /* var color = d3.scale.linear()
            .domain([0,1,2,3,4,5,6,10,15,20,100])
            .range(["#eee", "#fff", "#ggg", "#hhh", "#222", "#333", "#444", "#555", "#666", "#777", "#888", "#999"]);

    d3.layout.cloud().size([800, 300])
            .words(frequency_list)
            .rotate(0)
            .fontSize(function(d) { return d.size; })
            .on("end", draw)
            .start();

    function draw(words) {
        d3.select("#div_cloud").append("svg")
        	
                .attr("width", 1000)
                .attr("height", 400)
                .attr("class", "wordcloud")
                .append("g")
                // without the transform, words words would get cutoff to the left and top, they would
                // appear outside of the SVG area
                .attr("transform", "translate(320,200)")
                .selectAll("text")
                .data(words)
                .enter().append("text")
                .style("font-size", function(d) { return d.size + "px"; })
                .style("fill", function(d, i) { return color(i); })
                .style("color","blue") 
                .attr("transform", function(d) {
                    return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                })
                .text(function(d) { return d.text; });
    } */
    ///j3cloud end///
</script>
<span></span>


</body>
</html>
