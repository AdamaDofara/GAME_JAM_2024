/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

/**
 *
 * @author susuf
 */
/**
 * Classe qui va creer le plateau du jeu, elle est compose d'un tableau de
 * Pieces
 */
public class Plateau {

    private Piece[][] plateau = new Piece[8][8];
    

	public void initPlateau(Plateau p) {   // pour l'instant toute les piece ont les meme stat de départ
        for (int j = 0; j < 8; j++) {
            int i = 7;                     // corespond à la 8 eme ligne 
            switch (j) {
                case 0:
                    this.plateau[i][j] = new Tour(5, 3, 0, "Blanc", p, i, j);
                    break;
                case 1:
                    this.plateau[i][j] = new Cavalier(5, 3, 0, "Blanc", p, i, j);
                    break;

                case 2:
                    this.plateau[i][j] = new Fou(5, 3, 0, "Blanc", p, i, j);
                    break;

                case 3:
                    this.plateau[i][j] = new Roi(5, 3, 0, "Blanc", p, i, j);
                    break;
                case 4:
                    this.plateau[i][j] = new Reine(5, 3, 0, "Blanc", p, i, j);
                    break;

                case 5:
                    this.plateau[i][j] = new Fou(5, 3, 0, "Blanc", p, i, j);
                    break;
                case 6:
                    this.plateau[i][j] = new Cavalier(5, 3, 0, "Blanc", p, i, j);
                    break;

                case 7:
                    this.plateau[i][j] = new Tour(5, 3, 0, "Blanc", p, i, j);
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }

        }
        for (int j = 0; j < 8; j++) {//ligne de pion blanc
            int i = 6;  // corespond à la 7 eme ligne 
            this.plateau[i][j] = new Pion(5, 3, 0, "Blanc", p, i, j);       // int pDv = 5, int pDa =3 , int pDd =0, String c = "Blanc", Plateau p = plateau global, int x =i , int y = j

        }

        for (int j = 0; j < 8; j++) {        // 1 ere (t) ligne des Noir
            int i = 0;  // corespond à la 1 eme ligne 
            switch (j) {
                case 0:
                    this.plateau[i][j] = new Tour(5, 3, 0, "Noir", p, i, j);
                    break;
                case 1:
                    this.plateau[i][j] = new Cavalier(5, 3, 0, "Noir", p, i, j);
                    break;

                case 2:
                    this.plateau[i][j] = new Fou(5, 3, 0, "Noir", p, i, j);
                    break;

                case 3:
                    this.plateau[i][j] = new Roi(5, 3, 0, "Noir", p, i, j);
                    break;
                case 4:
                    this.plateau[i][j] = new Reine(5, 3, 0, "Noir", p, i, j);
                    break;

                case 5:
                    this.plateau[i][j] = new Fou(5, 3, 0, "Noir", p, i, j);
                    break;
                case 6:
                    this.plateau[i][j] = new Cavalier(5, 3, 0, "Noir", p, i, j);
                    break;

                case 7:
                    this.plateau[i][j] = new Tour(5, 3, 0, "Noir", p, i, j);
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        }

        for (int j = 0; j < 8; j++) {//ligne de pion noir
            int i = 1;  // corespond à la 2 eme ligne 
            this.plateau[i][j] = new Pion(5, 3, 0, "Noir", p, i, j);       // int pDv = 5, int pDa =3 , int pDd =0, String c = "Blanc", Plateau p = plateau global, int x =i , int y = j

        }

    }

    public boolean roiEstVivant(String couleur) { //parcours le tableau pour savoir si le roi de la couleur en parametre est vivant 
        boolean vivant = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            	if (this.plateau[i][j]!=null) {
            		if (this.plateau[i][j].couleur.equals(couleur) && this.plateau[i][j] instanceof Roi) {

                        vivant = true ;
                  
                    }
				}
            	
            }
        }
return(vivant);
    }

    public Piece getpieceAt(int x, int y) {// recup sans l enlever du plateau la piece contenu a une position [x][y]
        // attention il faut peut etre employer la fonction clone 
        return (this.plateau[x][y]);

    }

    public void setpieceAt(int x, int y, Piece p) { // met (et potentiellement écrase)la piece a une position [x][y]

        this.plateau[x][y] = p;

    }

    public void suppieceAt(int x, int y) {

        this.plateau[x][y] = null;

    }

    public Piece[][] getplateau() {// recup sans l enlever du plateau la piece contenu a une position [x][y]
        // attention il faut peut etre employer la fonction clone 
        return (this.plateau);

    }
    
    public void afficherPlateau() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (plateau[i][j] != null) {
					System.out.print(plateau[i][j].getcouleur()+" ");
				}
			}
			System.out.println("");
		}
    }
}
