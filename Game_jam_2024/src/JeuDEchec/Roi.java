/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

import java.util.ArrayList;

/**
 *
 * @author Kenny && Adama
 */

 


/**
 * Defini le comportement du roi
 */
public class Roi extends Piece{
	
	
	 public ArrayList<Coordonnee> deplacementPossible(){//
		 ArrayList<Coordonnee> possible = new ArrayList<Coordonnee>();
     	if(((x) >= 0 && (y+1) >= 0 && (x) < 8 && (y+1) < 8) && (this.plateau.getpieceAt(x,y+1) == null || !this.plateau.getpieceAt(x,y+1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x,y+1));
     	}
     	if(((x) >= 0 && (y-1) >= 0 && (x) < 8 && (y-1) < 8) && (this.plateau.getpieceAt(x,y-1) == null || !this.plateau.getpieceAt(x,y-1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x,y-1));
     	}
     	if(((x+1) >= 0 && (y) >= 0 && (x+1) < 8 && (y) < 8) && (this.plateau.getpieceAt(x+1,y) == null || !this.plateau.getpieceAt(x+1,y).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x+1,y));
     	}
     	if(((x-1) >= 0 && (y) >= 0 && (x-1) < 8 && (y) < 8) && (this.plateau.getpieceAt(x-1,y) == null || !this.plateau.getpieceAt(x-1,y).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x-1,y));
     	}
     	if(((x+1) >= 0 && (y+1) >= 0 && (x+1) < 8 && (y+1) < 8) && (this.plateau.getpieceAt(x+1,y+1) == null || !this.plateau.getpieceAt(x+1,y+1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x+1,y+1));
     	}
     	if(((x-1) >= 0 && (y+1) >= 0 && (x-1) < 8 && (y+1) < 8) && (this.plateau.getpieceAt(x-1,y+1) == null || !this.plateau.getpieceAt(x-1,y+1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x-1,y+1));
     	}
     	if(((x+1) >= 0 && (y-1) >= 0 && (x+1) < 8 && (y-1) < 8) && (this.plateau.getpieceAt(x+1,y-1) == null || !this.plateau.getpieceAt(x+1,y-1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x+1,y-1));
     	}
     	if(((x-1) >= 0 && (y-1) >= 0 && (x-1) < 8 && (y-1) < 8) && (this.plateau.getpieceAt(x-1,y-1) == null || !this.plateau.getpieceAt(x-1,y-1).couleur.equals(this.couleur))){
     		possible.add(new Coordonnee(x-1,y-1));
     	}
     	
     	return possible;
	    
	    }
	public Roi(int pDv, int pDa, int pDd, String c, Plateau p, int x, int y) {
       
        super(pDv, pDa, pDd, c, p, x, y);

    }

    }


