============================
|| GEEKTIC : TP pour J2EE ||
============================

Pre-requis
===========
/!\ La base de donn�es doit �tre lanc� AVANT le serveur Tomcat /!\

Les dossiers
===============
Le dossier "geektic" comporte les sources du projet
Le dossier "geektic BDD" comporte les fichier necessaire pour lancer la base
Les autres dossiers sont necessaire pour Gradlew
Enfin, le fichier "create_table" contient les instruction pour construire MA base avec MES donn�es


L'application Web
==================
L'utilisateur peut :
	- soit rechercher par pseudo (ou bout de pseudo)
	- soit rechercher par sexe + interet
	- soit utiliser le bouton "Au Hasard", un profil est alors affich� ... au hasard ...

Chaque geek poss�de un pseudo, un nom, un prenom, un sexe et un nombre de vues qui augmente � chaque affichage de la page 
(BUG : si l'utiliseteur "bourine" la touche F5, le nombre de vues augmente � chaque fois)

