<%@page import="board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<% BoardDTO brd =(BoardDTO)request.getAttribute("boardinforead"); %>
<div class="container">
<h1>�Խ��� </h1>
<hr/>
<form name="udt" method="post" action="board_infoupdate.do">

 <fieldset class="form-group">
 	<label for="exampleInputEmail1">�Խù���ȣ</label>
    <input type="text" class="form-control" name="board_no" id="board_no" value="<%=brd.getBoard_no() %>" placeholder=<%=brd.getBoard_no() %> readonly="readonly">
    
  </fieldset>
 

 <fieldset class="form-group">
 	<label for="exampleInputEmail1">�ۼ���</label>
    <input type="text" class="form-control" id="mem_id" value="<%=brd.getMem_id() %>" placeholder=<%=brd.getMem_id() %> readonly="readonly">
    
  </fieldset>
 
  <fieldset class="form-group">
    <label for="exampleInputEmail1">����</label>
    <input type="text" class="form-control" id="title" name="title" value="<%=brd.getTitle() %>" laceholder=<%=brd.getTitle() %>>
    <small class="text-muted">������ ������ �Է����ּ���</small>
  </fieldset>
 
  <fieldset class="form-group">
    <label for="exampleTextarea">����</label>
    <textarea class="form-control" id="exampleTextarea" name="text" rows="10" ><%=brd.getText() %></textarea>
  	<small class="text-muted">������ ������ �Է����ּ���</small>
  </fieldset>
 
  <button type="submit" class="btn btn-primary">����</button>
</form>

</div>
</body>
</html>