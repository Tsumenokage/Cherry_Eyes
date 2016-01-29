# Cherry_Eyes
Project to create and display eyes animation for the Robot Cherry in Python




##Idées pour le projet :
1. On aurait un sevreur python pour le momen j'utilise Karrigell
2. Sur ce serveur Pyhton, on aurait un ensemble de page type PIH (Python in HTML) ou le python se comporterait exactement comme le Javascript
3. Pour chacune de ces pages, on aurait un dossier img portant le même nom contenant l'ensemble des images nécessaires à l'animation
4. Sur chacune des ces pages on incluerait un script python qui auras pour objectif de créer l'animation en fonction de ce qui est donné en paramètre lors de son palle sur la page PIH
5. Enfin pour ouvrir ces pages PIH on ferait un simple script Python qui ne ferait que l'opération  webbrowser.open_new(url) et qui ouvrira un navigateur selon l'url passé en paramètre (127.0.0.1/pagePIH.pih dans notre cas).





##Mise en place de la solution actuelle :

1. Télécharger le serveur Python Karrigell, l'installer et le lancer
2. Dans le dépot github copier et coller le  dossier www dans le dossier d'installation de Karrigell
3. Regarder le script browser.py dans le dossier du dépot, il contient une instruction pour ouvrir le navigateur de base il s'agit de : webbrowser.open_new("127.0.0.1/eye.pih/neutral"). 
Cette ligne va ouvrir un navigateur et afficher la page eye.pih avec un argument : "neutral". Cela va indiquer quelle émotion est à afficher. 
Actuellement il y a les émotions suivantes : 
	* neutral
	* happy
	* sleepy
	* angry
	* sad
	* wink_r
	* wink_l

	En changeant l'argument neutral du script python par une autre émotion on aura une autre image qui s'affichera.