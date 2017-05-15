<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>
