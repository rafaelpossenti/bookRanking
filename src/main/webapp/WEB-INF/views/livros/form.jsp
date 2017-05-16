<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Livros</title>
</head>
<body>
	<form action="/bookRanking/livros" method="post">
		<div>
			<label>Título</label> <input type="text" name="title" />
		</div>
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="description"></textarea> 
		</div>
		
		<div>
			<label>Páginas</label> <input type="text" name="pages" />
		</div>
		
		<c:forEach items="${types}" var="priceType" varStatus="status">
			<div>
				<label>${priceType}</label> 
				<input type="text"   name="prices[${status.index}].value" /> 
				<input type="hidden" name="prices[${status.index}].type" value="${priceType}" />
			</div>
		</c:forEach>


		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>
