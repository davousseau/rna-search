# Fouille ARN
## Auteur
[David Brousseau](mailto:dbrsseau@gmail.com)

## Contexte académique
Projet effectué dans le cadre du cours **INF2120 Programmation II**, remis à l'enseignant **Bruno Malenfant** à l'[Université du Québec à Montréal](https://etudier.uqam.ca/) le 12 octobre 2017. Ce projet a été retranscris en janvier 2021 pour le rendre public et l'insérer dans mon porte-folio.

## Description
Simulation d'une recherche moléculaire qui retourne une combinaison d'un [nucléotide](https://fr.wikipedia.org/wiki/Nucl%C3%A9otide) et d'un [acid aminé](https://fr.wikipedia.org/wiki/Acide_amin%C3%A9). À noter que ce logiciel n'a pas d'interface graphique et que vous devez le lancer via votre éditeur de texte.

## Environnement suggéré
- [VS Code](https://code.visualstudio.com/), éditeur de texte pour modifier le code.
- [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack), extension du language Java réservé à l'usage de VS Code.
- [TODO Highlight](https://marketplace.visualstudio.com/items?itemName=wayou.vscode-todo-highlight), extension d'affichage des TODOs réservé à l'usage de VS Code.
- [JDK 11](https://openjdk.java.net/projects/jdk/11/), version de Java Development Kit pour compiler le code.

## Compatibilité
Testé sous des environnements **Linux** et **Windows**.

## Fonctionnement
Il suffit de suivre les étapes à l'écran.

On commence par saisir un ARN de base comprenant uniquement les lettres A, C, G et U. Cet ARN doit contenir au minimum 6 lettres et qui se divise par 3. Le logiciel compilera cet ARN pour nous demander d'effectuer une recherche par la suite.

Pour effectuer cette recherche, il y a 2 méthodes disponibles.

### Méthode 1
On doit saisir l'abréviation d'un acide aminé que l'on veut rechercher dans notre ARN de base parmi les suivants : Ala, Arg, Asn, Asp, Cys, Glu, Gln, Gly, His, Ile, Leu, Lys, Met, Phe, Pro, Pyl, Sec, Ser, Thr, Trp, Tyr et Val. Attention aux majuscules !

### Méthode 2
On doit saisir un nombre de lettres plus grand que 0 et qui se divise par 3 parmi les suivantes : A, B, C, D, G, H, K, M, N, R, S, U, V, W et Y. Ces lettres (ou séquence de lettres) représentent un acide aminé que l'on peut retrouver dans notre ARN de base.

## Références
- [~~IUPAC code for nucleotide and amino acid~~](https://www.bioinformatics.org/sms/iupac.html)
- [Nucleotide Codes, Amino Acid Codes, and Genetic Codes](https://www.genome.jp/kegg/catalog/codes1.html)
- [Scanner Class in Java](https://www.geeksforgeeks.org/scanner-class-in-java/)