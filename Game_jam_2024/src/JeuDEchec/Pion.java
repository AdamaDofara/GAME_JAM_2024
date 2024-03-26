/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

import java.util.ArrayList;

/**
 *
 * @author susuf
 */

  



/**
 * Defini le comportement d'un pion
 */
public class Pion extends Piece {
   
    
    
    public Pion(int pDv, int pDa, int pDd, String c, Plateau p, int x, int y) { // 
       
        super(pDv, pDa, pDd, c, p, x, y);
        
            
    }
    public ArrayList<int [][]> deplacementPossible(int xPosition, int yPosition){//
        int one_step;
		int two_step;
		Piece target = plateau.getpieceAt(xPosition, yPosition);
		
		if (this.getCouleur() == "Noir"){
			one_step = 1;
			two_step = 2;
		}
		else{
			one_step = -1;
			two_step = -2;
		}
		
		// Moving one step forward
		if (xPosition - this.getx() == one_step){
			// Straight
			if (yPosition == this.getYLocation() && target == null){
				return true;
			}
			// Diagonally
			if (Math.abs(this.getYLocation() - yPosition) == 1 && target != null){
				return true;
			}
		}
		// Two spaces
		else if (!hasMoved){
			if (xPosition - this.getXLocation() == two_step){
				if (yPosition == this.getYLocation() && target == null){
					return true;
				}
			}
		}

		return false;
     return(null);
    
    }
      public String getcouleur() {

        return (this.couleur);

    }
      public int getx() {

        return (this.x);

    }

    public int gety() {

        return (this.y);

    }
    
}

