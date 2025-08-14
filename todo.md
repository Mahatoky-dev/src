projet :
- teste de la rapidité de saisie du texte
- on peux saisire du texte et verifier combien de mot par minute on peut faire

# objectif  
permetre le saisi de texte et afficher une couleur quand il sagit du meme texte saisi
sauvgarider les texte saisi similaire
ajouté timeur
calculé le mot par minute et la precision

# todo
we need to create Class test Form check ve difference between textetaped and the defaut text
## backend bases
### Class Test :
#### atribut :
    - TexteTaped
    - TexteDefaut
#### method :
    - [ok] appendTappedLetter(x)
        - add to textTaped one letter
    - [ok] letterIsValideAt(x)
        - check if letter x taped is same of letter x defaut

## frontend bases
- [ok] main Frame
- [ok] TestPanel
    - [ok] afficher le texte original 
    - [ok] dessiner une champ pour stoquer le texte a ecrire
    - [ok] dessiner une par une chaque lettre du texte
    - [ok] si le lettre est valide le colorre en vert

## calcule word/min
- [ok] recupere le nb de mot 
- [ok] recupere le texte saisi corespondent a un mot
- [ok] pour chaque mot verifier les corespondance et stoquer que ceux qui sont simmilaire
- [ok] diviser le nb de mot simmilaire par la duration

## forntend resultat
- creation panel resulat 
    - west nb de mot par seconde
    - est precision
- afficher le pannel resultat quand le jeu est fini

# Panel de control
- cree une panel de control qui perme de choisir une langue
    - bouton de selection de langage
    - boutton reset
    - boutton stop 
    - temp d ecommencement
- de choisir une autre 