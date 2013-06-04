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
		
		<form method="POST" action="/geektic/search1">
			<fieldset><legend><h1>&nbsp;Entrez le pseudo du geek ou de la geekette ...&nbsp;</h1></legend>
				<input type="text" id="champ" name="pseudo">
				<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">		
			</fieldset>
		</form>
		
		<form method="POST" action="/geektic/search2">
			<fieldset><legend><h1>&nbsp;... ou recherchez par centres d'interêt&nbsp;</h1></legend>
				<div id="sexe">
					<input id="geek" type="radio" name="sexe" value="1" checked><label for="geek"></label><img src="img/geek.gif" alt="Geek" height="20%" width="20%">Geek</label></br></br>
					<input id="geekette" type="radio" name="sexe" value="2"><img src="img/geekette.gif" alt="Geekette" height="20%" width="20%">Geekette</br></br>  
					<input id="deux" type="radio" name="sexe" value="3"><img src="img/deux.gif" alt="Les deux" height="20%" width="20%">Les deux 
				</div>
				
				<div id="ci">
					<table>
						<tr>
							<td><input id="combo1" type="checkbox" name="interet" value="1">HTML</td>
							<td><input id="combo2" type="checkbox" name="interet" value="2">CSS</td>
							<td><input id="combo3" type="checkbox" name="interet" value="3">PHP</td>
							<td><input id="combo4" type="checkbox" name="interet" value="4">JS</td>
						</tr>
						<tr>
							<td><input id="combo5" type="checkbox" name="interet" value="5">JAVA</td>
							<td><input id="combo6" type="checkbox" name="interet" value="6">C</td>
							<td><input id="combo7" type="checkbox" name="interet" value="7">C++</td>
							<td><input id="combo8" type="checkbox" name="interet" value="8">C#</td>
						</tr>					
						<tr>
							<td><input id="combo9" type="checkbox" name="interet" value="9">JUnit</td>
							<td><input id="combo10" type="checkbox" name="interet" value="10">Mockito</td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				
				<div id="rechercher_ci">
					<input type="hidden" id="type_recherche" name="type_recherche" value="1">
					<input type="submit" id="b_rechercher" name="bouton" value="Rechercher">
				</div>
			</fieldset>			
		</form>
		
	</div>
	
	
	<footer>
	
	</footer>
	</body>
</html>