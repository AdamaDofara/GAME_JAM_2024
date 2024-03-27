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
public class Cavalier extends Piece {
	
	 public ArrayList<Coordonnee> deplacementPossible(){
	 ArrayList<Coordonnee> coords = new ArrayList<Coordonnee>();
 	if(this.couleur.equals("BLANC")){
 		if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((this.plateau.getpieceAt(x-2,y-1) == null) || this.plateau.getpieceAt(x-2,y-1).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x-2,y-1));
 		}
 		if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((this.plateau.getpieceAt(x-1,y-2) == null) || this.plateau.getpieceAt(x-1,y-2).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x-1,y-2));
 		}
 		if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((this.plateau.getpieceAt(x+1,y-2) == null) || this.plateau.getpieceAt(x+1, y-2).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x+1,y-2));
 		}
 		if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((this.plateau.getpieceAt(x+2,y-1) == null) || this.plateau.getpieceAt(x+2,y-1).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x+2,y-1));
 		}
 		if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((this.plateau.getpieceAt(x+2,y+1) == null) || this.plateau.getpieceAt(x+2,y+1).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x+2,y+1));
 		}
 		if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((this.plateau.getpieceAt(x+1,y+2) == null) || this.plateau.getpieceAt(x+1, y+2).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x+1,y+2));
 		}
 		if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((this.plateau.getpieceAt(x-1,y+2) == null) || this.plateau.getpieceAt(x-1, y+2).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x-1,y+2));
 		}
 		if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((this.plateau.getpieceAt(x-2,y+1) == null) || this.plateau.getpieceAt(x-2,y+1).couleur.equals("NOIR"))){
 			coords.add(new Coordonnee(x-2,y+1));
 		}
 	}
 	else{
 		if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((this.plateau.getpieceAt(x-2,y-1) == null) || this.plateau.getpieceAt(x-2,y-1).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x-2,y-1));
 		}
 		if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((this.plateau.getpieceAt(x-1,y-2) == null) || this.plateau.getpieceAt(x-1,y-2).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x-1,y-2));
 		}
 		if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((this.plateau.getpieceAt(x+1,y-2) == null) || this.plateau.getpieceAt(x+1, y-2).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x+1,y-2));
 		}
 		if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((this.plateau.getpieceAt(x+2,y-1) == null) || this.plateau.getpieceAt(x+2,y-1).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x+2,y-1));
 		}
 		if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((this.plateau.getpieceAt(x+2,y+1) == null) || this.plateau.getpieceAt(x+2,y+1).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x+2,y+1));
 		}
 		if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((this.plateau.getpieceAt(x+1,y+2) == null) || this.plateau.getpieceAt(x+1, y+2).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x+1,y+2));
 		}
 		if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((this.plateau.getpieceAt(x-1,y+2) == null) || this.plateau.getpieceAt(x-1, y+2).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x-1,y+2));
 		}
 		if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((this.plateau.getpieceAt(x-2,y+1) == null) || this.plateau.getpieceAt(x-2,y+1).couleur.equals("BLANC"))){
 			coords.add(new Coordonnee(x-2,y+1));
 		}
 	}
 return coords;
}
    public Cavalier(int pDv, int pDa, int pDd, String c, Plateau p, int x, int y) {
       
        super(pDv, pDa, pDd, c, p, x, y);

    }

}
