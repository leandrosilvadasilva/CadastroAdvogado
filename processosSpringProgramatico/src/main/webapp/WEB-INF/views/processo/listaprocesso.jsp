<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista dos Processos</title>
</head>
<body>
	<h1>Lista de Processos</h1>
	
	<div>${sucesso }</div>
			<table>
				<tr>
					<th>Nome</th>
					<th>Natureza do Processo</th>
				</tr>			
			
			<c:forEach items="${processos}" var="processos">
				<tr>
						<td>${processos.processoNome }</td>
						<td>${processos.naturezaProcesso }</td>
						
				</tr>
			
			</c:forEach>			
			
			
			</table>

</body>
</html>