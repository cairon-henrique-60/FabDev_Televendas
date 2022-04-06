<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Meu primeiro JSP 
<p> </p>
<%="Teste String JSP"%>
<p></p>
<%
	String str = "Minha String, "; 
	str = str + "complemento da string";
	
	out.print(str);
%>
</body>
</html>