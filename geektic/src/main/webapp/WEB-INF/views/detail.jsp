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
			<table id="liste">
				<tr><td>Nom : </td><td><c:out value="${geek.nom}"/></td></tr>
				
				<tr><td>Prenom : </td><td><c:out value="${geek.prenom}"/></td></tr>
				
				<tr><td>Sexe : 	</td><td><c:choose>
					    		<c:when test="${geek.sexe == 'M'}">
						    		<img src="img/geek.gif" alt="Geek" height="15%" width="15%">	
						    	</c:when>
						    	<c:when test="${geek.sexe == 'F'}">
						    		<img src="img/geekette.gif" alt="Geekette" height="15%" width="15%">
						    	</c:when>
							</c:choose></td></tr>		
							
				<tr><td>Nombre de vues : </td><td><c:out value="${geek.nbvus}"/></td></tr>		
					
				<tr><td>Interet(s) : 	</td></tr><c:forEach var="interet" items="${geek.interets}">
										<tr><td></td><td><input type="checkbox" disabled checked><c:out value="${interet.libelle}"></c:out></td></tr>	
									</c:forEach>	
									
			</table>
			
			<h2><a href="<c:url value='/'/>">Retour à la page de recherche</a></h2>
		</div>
	</body>
</html>