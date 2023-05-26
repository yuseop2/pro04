<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세보기</title>
</head>
<body>
	<table class="table">
		<tbody>				
			<tr>
				<th>글 번호</th>
				<td>${notice.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${notice.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${notice.content }</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${notice.author }</td>
			</tr>
			<tr>
				<th>작성 일시</th>
				<td>${notice.resdate }</td>
			</tr>
			<tr>
				<th>조회 수</th>
				<td>${notice.readcnt }</td>
			</tr>				
		</tbody>
	</table>	
	<a href="${path1 }/notice/list.do">글 목록으로</a>
	<a href="/">메인으로</a>
</body>
</html>