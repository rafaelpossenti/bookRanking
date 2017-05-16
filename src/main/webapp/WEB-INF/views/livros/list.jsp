<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Livros</title>
</head>
<body>
	
	<h1>Lista de Livros </h1>
	
	<div>${sucesso} </div>
	
	<table>
		<tr>
			<td>Título</td>
			<td>Descrição</td>
			<td>Páginas</td>
		</tr>

		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.title} </td>
				<td>${book.description}</td>
				<td>${book.pages}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
