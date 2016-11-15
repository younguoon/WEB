<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Stock Analysis System</title>
<style type="text/css">
	#content{
		width:100%;
		float: left;
	}
</style>

</head>
<body>
	<div id="top">
		<tiles:insertAttribute name="top"/>
	</div>
	
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div>
</body>
</html>

