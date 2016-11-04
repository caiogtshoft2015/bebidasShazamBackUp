<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Produto</title>
</head>
<body>

	<form name="cadastroProduto" method="post"
	 action="ControleProduto?acao=cadastrarProduto">
	 
	 	<h4>Dados Gerais:</h4>
	 	<hr>
		
		<label>Nome:
			<input nome="nome" placeholder="Digite aqui" />
		</label> <br/><br/>
		
		<label>Fornecedor:
			<select nome="fornecedor">
			<option>Broto Sábio</option>
			<option>Estrela Artois</option>
			<option>Caracu</option>
			</select>
		</label> <br/><br/>
		
		<label>Categoria:
			<select nome="categoria">
			<option>250ml</option>
			<option>350ml</option>
			<option>Long Neck</option>
			<option>Barril</option>
			</select>
		</label> <br/><br/>
		
		<label>Valor de Venda:R$
			<input nome="valor_venda" placeholder="00,00" />
		</label> <br/><br/>
		
		<label>Valor de Custo:R$
			<input nome="valor_custo" placeholder="00,00" />
		</label> <br/><br/>

		<input type = "submit" value="Cadastrar" id"cadastrar"/>

	</form>
</body>
</html>