<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<title>ȸ����������</title>

<% MemberDTO user = (MemberDTO)request.getAttribute("user"); %>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<form name="form1" method="post" 
					action="update.do">
<table align="center" cellpadding="0" cellspacing="0" width="479">
    <tr>
        <td width="469" colspan="2" height="42">
            <p align="center"><code><b><span style="font-size:20pt;">ȸ������</span></b></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <hr></td>
    </tr>
 
    <tr>
        <td width="104">
            <p><code><b>���̵�</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="hidden" name="id" 
            value="<%=user.getId() %>" size="30"/><%=user.getId() %></code></p>
        </td>
    </tr>
   <tr>
        <td width="104">
            <p><code><b>��й�ȣ</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="pass" 
            value="<%=user.getPass() %>" size="30"/></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>����</b></code></p>
        </td>
        <td width="359">
            <p><code><%=user.getName() %></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>�ּ�</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="addr"
            value="<%=user.getAddr() %>" size="51"/></code></p>
        </td>
    </tr>
    
    <tr>
        <td width="104">
            <p><code><b>���</b></code></p>
        </td>
        <td width="359">
            <p><textarea name="grade" rows="10" 
            cols="50"><%=user.getGrade() %></textarea></p>
        </td>
    </tr>
    
    <tr>
        <td width="479" colspan="2">
            <hr>        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <p align="center"><input type="submit" name="formbutton1" value="����"></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="9" valign="bottom">            
                <p><code><a href="">����Ʈ(L)</a></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="57" valign="bottom">            <p align="right"><code><input type="hidden" name="jumin"><input type="hidden" name="ilsi"></code></p>
        </td>
    </tr>
</table>
</form>
</body>

</html>


<%-- <%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="emp.dto.MemberDTO"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<title>ȸ����������</title>


</head>
<% MemberDTO user = (MemberDTO) request.getAttribute("userInfo"); %>
<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<form name="form1" method="post" action="mybatisupdate.do">
<input type="hidden" name="id" value="<%= user.getId()%>">				
<table align="center" cellpadding="0" cellspacing="0" width="479">
    <tr>
        <td width="469" colspan="2" height="42">
            <p align="center"><code><b><span style="font-size:20pt;">ȸ������</span></b></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <hr></td>
    </tr>
 	
    <tr>
		
        <td width="104">
            <p><code><b>���̵�</b></code></p>
        </td>
        <td width="359">
            <p><code><%= user.getId() %></code></p>
        </td>
    </tr>
   <tr>
        <td width="104">
            <p><code><b>��й�ȣ</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="pass" 
            value="<%= user.getPass()%>" size="30"></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>����</b></code></p>
        </td>
        <td width="359">
            <p><code><%= user.getName()%></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>�ּ�</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="addr"
            value="<%= user.getAddr() %>" size="51"></code></p>
        </td>
    </tr>
 
    <tr>
        <td width="104">
            <p><code><b>���</b></code></p>
        </td>
        <td width="359">
            <p><textarea name="grade" rows="10" 
            cols="50"><%= user.getGrade() %></textarea></p>
        </td>
    </tr>
   
   
    <tr>
        <td width="479" colspan="2">
            <hr>        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <p align="center"><input type="submit" name="formbutton1" value="����"></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="9" valign="bottom">            
                <p><code><a href="">����Ʈ(L)</a></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="57" valign="bottom">            <p align="right"><code><input type="hidden" name="jumin"><input type="hidden" name="ilsi"></code></p>
        </td>
    </tr>
</table>
</form>
</body>

</html>
 --%>