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
	
		<div id="contenu">
	
			<form method="GET" action="searchPseudo">
				<fieldset>
					<legend><h1>&nbsp;Entrez le pseudo du geek ou de la geekette ...&nbsp;</h1></legend>
					<input type="text" id="champ" name="pseudo">
					<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">
				</fieldset>
			</form>	
			
			<form method="GET" action="searchSexe">
				<fieldset><legend><h1>&nbsp;... ou recherchez par sexe&nbsp;</h1></legend>
					<div id="sexe">
						<input type="radio" name="radioBouton" value="M"><img src="img/geek.gif" alt="Geek" height="20%" width="20%">Geek</br></br>
						<input type="radio" name="radioBouton" value="F"><img src="img/geekette.gif" alt="Geekette" height="20%" width="20%">Geekette</br></br>  
						<input type="radio" name="radioBouton" value="D" checked><img src="img/deux.gif" alt="Les deux" height="20%" width="20%">Les deux 
					</div>
					
					<div id="ci">
					<table>
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="1">HTML</td>
							<td><input id="combo" type="checkbox" name="combo" value="2">CSS</td>
							<td><input id="combo" type="checkbox" name="combo" value="3">PHP</td>
							<td><input id="combo" type="checkbox" name="combo" value="4">JS</td>
						</tr>
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="5">JAVA</td>
							<td><input id="combo" type="checkbox" name="combo" value="6">C</td>
							<td><input id="combo" type="checkbox" name="combo" value="7">C++</td>
							<td><input id="combo" type="checkbox" name="combo" value="8">C#</td>
						</tr>					
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="9">JUnit</td>
							<td><input id="combo" type="checkbox" name="combo" value="10">Mockito</td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
					
					<div id="rechercher_ci">
						<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">
					</div>
				</fieldset>
			</form>
			
			
			<br/>
			<form method="GET" action="searchJDLC">
				<center>
					<input type="submit" id="b_jdlc" name="jdlc" value="Au hasard !">
				</center>
			</form>
		</div>
		
			
		
	</body>
</html>