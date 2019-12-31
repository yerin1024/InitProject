<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>
<c:forEach items="${memberList}" var="mdto">
<table>
<tr>
<th>profile</th>
<th>nickname</th>
<th>name</th>
<th>email</th>
<th>edit</th>
</tr>
<tr>
<td>${mdto.profile}</td>
<td>${mdto.nickname}</td>
<td>${mdto.name}</td>
<td>${mdto.email}</td>
<td><button class="wdBtn" id="withdrawal">탈퇴</button><button class="cbBtn" id="comeback">되살리기</button></td>
</tr>
</table>
</c:forEach>
</body>
<script>
$(".wdBtn").on("click",function(){
	var withdrawal = $(this).attr("id");
	$.ajax({
		url : "${pageContext.request.contextPath}/admin/withdrawalProc.do",
		type : "post",
		data : {
			withdrawal : withdrawal
		}
	}).done(function(resp){
		resp.reload();
	}).fail(function(a,b,c){
		console.log(a);
		console.log(b);
		console.log(c);
	});
});
</script>
</html>