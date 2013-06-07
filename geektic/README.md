============================
|| GEEKTIC : TP pour J2EE ||
============================

Pre-requis
===========
/!\ La base de données doit être lancé AVANT le serveur Tomcat /!\

Les dossiers
===============
Le dossier "geektic" comporte les sources du projet
Le dossier "geektic BDD" comporte les fichier necessaire pour lancer la base
Les autres dossiers sont necessaire pour Gradlew
Enfin, le fichier "create_table" contient les instruction pour construire MA base avec MES données


L'application Web
==================
L'utilisateur peut :
	- soit rechercher par pseudo (ou bout de pseudo)
	- soit rechercher par sexe + interet
	- soit utiliser le bouton "Au Hasard", un profil est alors affiché ... au hasard ...

Chaque geek possède un pseudo, un nom, un prenom, un sexe et un nombre de vues qui augmente à chaque affichage de la page 
(BUG : si l'utiliseteur "bourine" la touche F5, le nombre de vues augmente à chaque fois)

