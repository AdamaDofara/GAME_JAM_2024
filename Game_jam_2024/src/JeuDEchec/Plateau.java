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

    
    
    public void initPlateau(Plateau p){                                    
          for (int j = 0; j < 8; j++) {//ligne de pion blanc
          int i = 1;  // corespond à la 2 eme ligne 
          this.plateau[i][j]= new Pion(5,3,0,"Blanc",p, i, j);       // int pDv = 5, int pDa =3 , int pDd =0, String c = "Blanc", Plateau p = plateau global, int x =i , int y = j
          
          
          }
          for (int j = 0; j < 8; j++) {//ligne de pion noir
          int i = 6;  // corespond à la 7 eme ligne 
          this.plateau[i][j]= new Pion(5,3,0,"Noir",p, i, j);       // int pDv = 5, int pDa =3 , int pDd =0, String c = "Blanc", Plateau p = plateau global, int x =i , int y = j
          
          }




                                        
                                       //
    }
    
    
    public Piece getpieceAt(int x, int y) {// recup sans l enlever du plateau la piece contenu a une position [x][y]
                                              // attention il faut peut etre employer la fonction clone 
        return (this.plateau[x][y]);

    }
public void setpieceAt(int x, int y, Piece p) { // met (et potentiellement écrase)la piece a une position [x][y]

      this.plateau[x][y]= p;

    }

public void suppieceAt(int x, int y) { 

      this.plateau[x][y]= null;

    }

 public Piece[][] getplateau() {// recup sans l enlever du plateau la piece contenu a une position [x][y]
                                              // attention il faut peut etre employer la fonction clone 
        return(this.plateau);

    }
}
