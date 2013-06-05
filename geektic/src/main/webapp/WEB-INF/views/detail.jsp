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
			<h2><c:out value="${spectacle.pseudo}"/></h2>
			
			Nom : <c:out value="${spectacle.artiste}"/>
			<br/>
			Prenom : <c:out value="${spectacle.prenom}"/>
			<br/>
			Sexe : <c:out value="${spectacle.sexe}"/>			
			<br/>
			
			<a href="<c:url value='/'/>">Retour à la recherche</a>
		</div>
	</body>
</html>