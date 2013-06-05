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
				<h1>Résultat de recherche</h1>
			
				<c:forEach var="spectacle" items="${geeks}">
			    	<li>
			    		<c:out value="${spectacle.pseudo}"/>
			    		<a href="<c:url value='/detail'><c:param name='id' value='${spectacle.id}' /></c:url>">Voir le profil</a>
			    	</li>
			    </c:forEach>
			    
			    <br/>
			    <h2><a href="<c:url value='/'/>">Retour à la page de recherche</a></h2>
		</div>
	</body>
</html>