<html>
	<head>
		<title>Geektic</title>
		<!--CSS-->
		<link href="css/style.css" rel="stylesheet" media="screen">
	</head>
	
	<body>
	<header>
	</header>		
		
	<div id="contenu">
		
		<form method="POST" action="">
			<fieldset><legend><h1>&nbsp;Entrez le pseudo du geek ou de la geekette ...&nbsp;</h1></legend>
				<input type="text" id="champ">
				<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">		
			</fieldset>
		</form>
		
		<form method="POST" action="">
			<fieldset><legend><h1>&nbsp;... ou recherchez par centres d'interêt&nbsp;</h1></legend>
				<div id="sexe">
					<input id="geek" type="radio" name="sexe" value="1" checked><label for="geek"></label><img src="img/geek.gif" alt="Geek" height="20%" width="20%">Geek</label></br></br>
					<input id="geekette" type="radio" name="sexe" value="2"><img src="img/geekette.gif" alt="Geekette" height="20%" width="20%">Geekette</br></br>  
					<input id="deux" type="radio" name="sexe" value="3"><img src="img/deux.gif" alt="Les deux" height="20%" width="20%">Les deux 
				</div>
				
				<div id="ci">
					<table>
						<tr>
							<td><input id="combo1" type="checkbox" name="int_html" value="1">HTML</td>
							<td><input id="combo2" type="checkbox" name="int_css" value="2">CSS</td>
							<td><input id="combo3" type="checkbox" name="int_php" value="3">PHP</td>
							<td><input id="combo4" type="checkbox" name="int_js" value="4">JS</td>
						</tr>
						<tr>
							<td><input id="combo5" type="checkbox" name="int_java" value="5">JAVA</td>
							<td><input id="combo6" type="checkbox" name="int_c" value="6">C</td>
							<td><input id="combo7" type="checkbox" name="int_cpp" value="7">C++</td>
							<td><input id="combo8" type="checkbox" name="int_cs" value="8">C#</td>
						</tr>					
						<tr>
							<td><input id="combo9" type="checkbox" name="int_junit" value="9">JUnit</td>
							<td><input id="combo10" type="checkbox" name="int_mockito" value="10">Mockito</td>
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
		
	</div>
	
	
	<% for (int i=0; i<listeGeeks.size(); i++) { %>
	
	 <%=listeGeeks.get(i).getPseudo()+", "%>
	
	<% } %>
	
	
	<footer>
	
	</footer>
	</body>
</html>