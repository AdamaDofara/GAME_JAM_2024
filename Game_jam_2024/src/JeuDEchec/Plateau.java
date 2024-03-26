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

    
    
    public void initPlateau(){
    
    
    
    }
    
    
    public Piece getpieceAt(int x, int y) {// recup sans l enlever du plateau la piece contenu a une position [x][y]
                                              // attention il faut peut etre employer la fonction clone 
        return (this.plateau[x][y]);

    }
public void setpieceAt(int x, int y, Piece p) { // met (et potentiellement écrase)la piece a une position [x][y]

      this.plateau[x][y]= p;

    }
}
