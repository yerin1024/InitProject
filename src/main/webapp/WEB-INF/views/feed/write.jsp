<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.js"></script>
</head>
<style>
	#wrapper{
		padding-top:10px;
		width:1000px;
		height:800px;
		margin:auto;
		border:2px solid navy;
	}
	button{
		border:2px solid navy;
		background-color:white;
	}
	#realContents{
		display:none;
	}
	.title{
		width:90px;
		display:inline-block;
	}
</style>
<body>
	<div id="wrapper">
		<form id="writeForm" action="/board/writeProc" method="post" enctype="multipart/form-data">
			<div><p class="title">제목</p>&nbsp;&nbsp;&nbsp;<input type="text" name="title" style="width:800px"></div>
			<div><p class="title">파일첨부</p>&nbsp;&nbsp;&nbsp;<input type="file" name="files" multiple="multiple"></div>
			<input type="text" name="contents" id="realContents">
		</form>
			<div><textarea id="summernote"></textarea></div>
			<div style="text-align:right"><button type="button" id="regist">등록</button></div>
	</div>

	<script>
		$('#summernote').summernote({
	        tabsize: 2,
	        height: 610,
	        width: 990,
	        disableResizeEditor: true
		});
		$("#regist").on("click", function(){
			$("#realContents").val($("#summernote").val());
			$("#writeForm").submit();
		});
	</script>
</body>
</html>