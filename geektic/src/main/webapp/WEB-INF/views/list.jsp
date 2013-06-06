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
			
				<table id="liste">
					<c:forEach var="geek" items="${geeks}">
				    	<tr>
				    		<td id="tdListe">
					    		<c:choose>
						    		<c:when test="${geek.sexe == 'M'}">
							    		<img src="img/geek.gif" alt="Geek" height="100%" width="100%">	
							    	</c:when>
							    	<c:when test="${geek.sexe == 'F'}">
							    		<img src="img/geekette.gif" alt="Geekette" height="100%" width="100%">
							    	</c:when>
								</c:choose>							
				    		</td>
				    		<td><c:out value="${geek.pseudo}"/></td>
				    		<td><a href="<c:url value='/detail'><c:param name='id' value='${geek.id}' /></c:url>">Voir le profil</a></td>
				    	</tr>
				    </c:forEach>
			    </table>
			    
			    <br/>
			    <h2><a href="<c:url value='/'/>">Retour à la page de recherche</a></h2>
		</div>
	</body>
</html>