<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cliente</title>
</head>
<body>
	<h2>Cadastro de Clientes</h2>
	<form action="${linkTo[IndexController].cadastraCliente }" method="post">
		<label>Nome:</label>
			<input type="text" name="pessoa.nome">
		<label>CPF:</label>
			<input type="text" name="pessoa.cpf">
		<label>ID Cliente</label>
			<input type="text" name="pessoa.cliente.id_cliente">	
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>