# rendre le menu bar fonctionnel

- [ok] timer
- [ok] restart bt

# afficher stat a la fin d'une teste

- [ok] ajouté la pannel statTest dans main frame
- [ok] actualiser cette stat quand le test est terminer

# posibilité de check les erreur

- ajouté un boutton check erreur dans MenuBar
- cette boutton peut etre afficher et ne pas etre afficher (par defaut elle est non afficher)
- apres la fin d'un teste , si la teste est diferent de 100% :
    - on affiche le boutton check error
    - quand on va clique dessus le texte du teste va etre l'ensemble des texte mal saisi
## backend
- cree une fonciton qui cree a partitre des textes mal saisi une texte

## frontend
- cree le boutton dans menuBar checkError dans Statistique
- StatView dois pouvoir metre en evidence une methode pour afficher et cacheLe boutton check error

## controleur
- au clique de check error
    - metre dans test les text error
    - reactualiser l'affichage (testView)

## todo
- affichage du boutton check erreur
    - front cree une boutton check Error dans StatView
    - afficher 2 methode displayCheckErrorBt(Bollean)
- controle l'affichage du bt :
    - a la fin d'une teste verifier si le test et 100% ou non :
    - afficher le button si non lassez si oui

## bug a fixé :
- [fixé] Quand on fini la saisi d'une teste (tape la derniere lettre du texte de teste) le chrono
devrais s'arrété . 
Ce qui ne se masse pas ici .
Le chrono ne s'arréte que lorsqu'on clique une nouvelle fois apres la clique du derniere lettre.
Le .
A retenir : La statistique elle ,s'actualise au bon momment .

comit

## foctionnalité suivante :
possibilité de generer du texte .

- ajouté un boutton generé texte 
qui va generer une texte aleatoire.
Cette texte va etre utilises dans le teste.

### todo :
- ajout du boutton generer dans vue.MenuBar
    - ajout dans la classe menu bar
    - ajout de focntion addListner dans l'interface
- creation d'une classe permetant de generer du texte
    - recuperer des words avec le language.
    - cree une fonction getRandomText(langage,nb d'word)
- creation du listner qui ,sur le clique du boutton va :
    - gerer le texe
    - le metre dans l'affichage