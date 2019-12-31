<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
</head>
<style>
	button{
		border:2px solid navy;
		background-color:white;
	}
</style>
<body>
	<table id="board" class="display" style="width:100%">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
        <c:choose>
        	<c:when test="${fn:length(list) > 0}">
	            <c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.seq }
			            <td>${dto.title }
			            <td>${dto.writer }
			            <td>${dto.write_date }
		            </tr>
		        </c:forEach>
			</c:when>
		</c:choose>
		</tbody>
		<tr id="btn">
			<td colspan="4"><button id="write">write</button>&nbsp;&nbsp;&nbsp;<button id="home">home</button>
		</tr>
    </table>
    <script>
	    $(document).ready(function() {
	        $('#board').DataTable();
	    } );
	    $("#home").on("click", function(){
	    	location.href="/home";
	    })
	    $("#write").on("click", function(){
	    	location.href="/board/write";
	    })
    </script>
</body>
</html>