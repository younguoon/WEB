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
<% BoardDTO brd =(BoardDTO)request.getAttribute("boardinfo"); %>
<div class="container">
<h1>�Խ��� </h1>
<hr/>
<table class="table table-bordered" width="200">
  <thead>
    <tr>
      <th bgcolor="#f7f7f7"><%=brd.getTitle() %></th>
    </tr>
  </thead>
  <tbody>

	<tr>
	    <td>
	    <input type="hidden" name="mem_id" value="<%=brd.getMem_id()%>">�ۼ��� :<%=brd.getMem_id()%></td>
    	
    </tr>
	 <tr>
	    <td>
	    <input type="hidden" name="board_no" value="<%=brd.getBoard_no()%>">�Խù� ��ȣ: <%=brd.getBoard_no()%>
	    &nbsp;&nbsp;&nbsp; 
	    <%String textDate = brd.getReg_dtm();
		  
		System.out.println(textDate.substring(0,4)+"/"+textDate.substring(4,6)
		+"/"+textDate.substring(6,8)+" "+textDate.substring(8,10)+":"+textDate.substring(10,12)
		+":"+textDate.substring(12,14)); %>
	    <input type="hidden" name="reg_dtm" value="<%=brd.getReg_dtm()%>">�Խù� ���� ����� : <%=brd.getReg_dtm()%>
	    &nbsp;&nbsp;&nbsp;
	    
	    <input type="hidden" name="count" value="<%=brd.getCount()%>">�Խù� ��ȸ��: <%=brd.getCount()%>
	    
	    </td>
    	
    </tr>
   		
    <tr>
    <%if(brd.getMod_dtm()==null){ %>
	    <td>�Խù�  ���� ���� : - </td>
	<%}else{ %>
	<td><input type="hidden" name="mod_dtm" value="<%=brd.getMod_dtm()%>">�Խù�  ���� ���� :<%=brd.getMod_dtm()%></td>
	    <%} %>
	</tr>
	
	<tr>
		<td height="300"><input type="hidden" name="text" value="<%=brd.getText()%>"><%=brd.getText()%></td>
	</tr>
   
     </tbody>
</table>
<br/>
<button type="button" class="btn btn-info" onclick="location.href='board_list.do'">����Ʈ</button>
<button type="button" class="btn btn-info" onclick="location.href='board_update.do?board_no=<%=brd.getBoard_no()%>'">�Խù� ����</button>        
<button type="button" class="btn btn-danger" onclick="location.href='board_delete.do?board_no=<%=brd.getBoard_no()%>'">�Խù� ����</button>       
</div>
</body>
</html>