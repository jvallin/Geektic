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
			<h2><c:out value="${geek.pseudo}"/></h2>
			
			Nom : <c:out value="${geek.nom}"/>
			<br/>
			Prenom : <c:out value="${geek.prenom}"/>
			<br/>
			Sexe : <c:out value="${geek.sexe}"/>			
			<br/>
			Nombre de vues : <c:out value="${geek.nbvus}"/>			
			<br/>
			
			<h2><a href="<c:url value='/'/>">Retour à la page de recherche</a></h2>
		</div>
	</body>
</html>