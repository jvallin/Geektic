<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Geektic</title>
		<!--CSS-->
		<link href="css/style.css" rel="stylesheet" media="screen">
	</head>
	<body>
		<header> </header>
		<div id="result">
			<h2><c:out value="${geeks.pseudo}"/></h2>
			
			Nom : <c:out value="${geeks.nom}"/>
			<br/>
			Prenom : <c:out value="${geeks.prenom}"/>
			<br/>
			Sexe : <c:out value="${geeks.sexe}"/>			
			<br/>
			
			<a href="<c:url value='/'/>">Retour à la recherche</a>
		</div>
	</body>
</html>