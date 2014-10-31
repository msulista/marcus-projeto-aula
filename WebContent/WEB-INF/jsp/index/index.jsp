<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>	
	<h2>Cadastro de Clientes</h2>
	
	<form action="${pageContext.request.contextPath}/index/cadastraCliente" method="post">
		<label>Nome:</label>
			<input type="text" name="cliente.nome">
		<label>CPF:</label>
			<input type="text" name="cliente.cpf">
		<label>ID Cliente</label>
			<input type="text" name="cliente.idCliente">	
		<input type="submit" value="Salvar" />
	</form>
</body>
</html>