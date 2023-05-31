<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path1" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>폼 유효성 검사6</title>
</head>
<body>
	<h2>FORM 유효성 검사6</h2>
	<form:form action="${path1 }/check/check6.do" method="post" modelAttribute="memberVO">
	    <table>		    	
	    	<tbody>	
	    		<tr>
	    			<th>ID</th>
	    			<td>
	    				<form:input path="id" />
	     				<form:errors path="id" element="div" delimiter=" " />
	    			</td>
	    		</tr>
	    		<tr>
	    			<th>PW</th>
	    			<td>
	    				 <form:password path="pw"/>
	   					 <form:errors path="pw" element="div" delimiter=" " />
	    			</td>
	    		</tr>
	    		<tr>
					<td colspan="2">
						<input type="submit" value="로그인" class="btn btn-primary"/>
						<input type="reset" value="취소" class="btn btn-primary"/>					
					</td>
				</tr>
			</tbody>		
	    </table>
	</form:form>
</body>
</html>