<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../common/header.jsp" %>
<%@ include file="../common/navigation.jsp" %>

<h1>
	게시물리스트	
</h1>
<table class="table table-striped">
<tr>
<th>BNO</th>
<th>TITLE</th>
<th>WRITTER</th>
<th>REGDATE</th>
<th>VIEXCNT</th>

</tr>
<tr>
<td></td>

</tr>

 </table>

${list }

<%@ include file="../common/footer.jsp" %>