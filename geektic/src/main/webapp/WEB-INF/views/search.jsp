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
					<legend>&nbsp;Entrez le pseudo du geek ou de la geekette ...&nbsp;</legend>
					<input type="text" id="champ" name="pseudo">
					<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">
				</fieldset>
			</form>	
						
			<form method="GET" action="searchSexe">
				<fieldset><legend>&nbsp;... ou recherchez par sexe&nbsp;</legend>
					<div id="sexe">
						<input id="r_b" type="radio" name="radioBouton" value="H"><img src="img/geek.gif" alt="Geek" height="20%" width="20%">Geek<br/><br/>
						<input id="r_b" type="radio" name="radioBouton" value="F"><img src="img/geekette.gif" alt="Geekette" height="20%" width="20%">Geekette<br/><br/>  
						<input id="r_b" type="radio" name="radioBouton" value="D" checked><img src="img/deux.gif" alt="Les deux" height="20%" width="20%">Sans importance 
					</div>
					
					<div id="ci">
					<table>
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="HTML">HTML</td>
							<td><input id="combo" type="checkbox" name="combo" value="CSS">CSS</td>
							<td><input id="combo" type="checkbox" name="combo" value="PHP">PHP</td>
							<td><input id="combo" type="checkbox" name="combo" value="JS">JS</td>
						</tr>
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="JAVA">JAVA</td>
							<td><input id="combo" type="checkbox" name="combo" value="C">C</td>
							<td><input id="combo" type="checkbox" name="combo" value="C++">C++</td>
							<td><input id="combo" type="checkbox" name="combo" value="C#">C#</td>
						</tr>					
						<tr>
							<td><input id="combo" type="checkbox" name="combo" value="JUnit">JUnit</td>
							<td><input id="combo" type="checkbox" name="combo" value="Mockito">Mockito</td>
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
				<div id="hasard">
					<input type="submit" id="b_jdlc" name="jdlc" value="Au hasard !">
				</div>
			</form>
		</div>
		
			
		
	</body>
</html>