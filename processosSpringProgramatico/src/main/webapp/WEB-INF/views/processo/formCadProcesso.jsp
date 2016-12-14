<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadatro Processo</title>
</head>
<body>


<form:form action="/processosSpringProgramatico/processo" method="POST" commandName="processo">


<h1>CADASTRO PROCESSOS:</h1>

<label>Nome</label>

<input type="text" name="processoNome">
<form:errors path="processoNome"/>
<div>
				<label>Natureza</label>  
					<select name="naturezaProcesso">
						  <option value="CIVEL">Cível</option>
						  <option value="ELEITORAL">Eleitoral</option>
						  <option value="MILITAR">Militar</option>
						  <option value="PENAL">Penal</option>
						  <option value="PREVIDENCIARIA">Previdenciária</option>
						  <option value="SOCIETARIO">Societário</option>
						  <option value="TRABALHISTA">Trabalhista</option>
						  <option value="TRIBUTARIA">Tributária</option>
					</select>
</div>
<button type="submit">Enviar</button>


</form:form>

</body>
</html>