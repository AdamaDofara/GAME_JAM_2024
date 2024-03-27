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
    private boolean premierCoup = true;

    public boolean coupPossible(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            return false;
        }

        if (this.plateau.getpieceAt(x, y) != null) {
            if (this.couleur.equals("Blanc")) {
                if (x == this.x + 1 && y == this.y + 1) {
                    return true;
                }
                if (x == this.x - 1 && y == this.y + 1) {
                    return true;
                }
            } else {
                if (x == this.x - 1 && y == this.y - 1) {
                    return true;
                }
                if (x == this.x + 1 && y == this.y - 1) {
                    return true;
                }
            }

        }
        if (this.plateau.getpieceAt(x, y) == null) {
            if (this.couleur.equals("Blanc")) {
                if (x == this.x && y == this.y + 2 && premierCoup == true) {
                    return true;

                }
                if (x == this.x && y == this.y + 1) {
                    return true;
                }
            } else {
                if (x == this.x && y == this.y - 2 && premierCoup == true) {
                    return true;
                }
                if (x == this.x && y == this.y - 1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /**
     * Verifie si il n'y a pas d'obstacle au deplacement
     *
     * @param x
     * @param y
     * @return vrai ou faux
     */
    public String verifier(int x, int y) {
        return ("");
    }

    /**
     * Recupere les coordonnees de toutes les cases ou peut aller la piece
     *
     * @return ArrayList<Coordonnee> de tous les coups possibles
     */
    public ArrayList<Coordonnee> casesPossibles() {
        ArrayList<Coordonnee> coords = new ArrayList<Coordonnee>();
        if (this.couleur.equals("Blanc")) {
            if (((x + 1) >= 0 && (y + 1) >= 0 && (x + 1) < 8 && (y + 1) < 8) && (this.plateau.getpieceAt(x + 1, y + 1) != null) && this.plateau.getpieceAt(x + 1, y + 1).couleur.equals("Noir")) {
                coords.add(new Coordonnee(x + 1, y + 1));
            }
            if (((x - 1) >= 0 && (y + 1) >= 0 && (x - 1) < 8 && (y + 1) < 8) && (this.plateau.getpieceAt(x - 1, y + 1) != null) && this.plateau.getpieceAt(x - 1, y + 1).couleur.equals("Noir")) {
                coords.add(new Coordonnee(x - 1, y + 1));
            }
            if (y <= 5 && premierCoup && plateau.getpieceAt(x, y + 1) == null && plateau.getpieceAt(x, y + 2) == null) {
                coords.add(new Coordonnee(x, y + 1));
                coords.add(new Coordonnee(x, y + 2));
            }
            if (y < 7 && plateau.getpieceAt(x, y + 1) == null) {
                coords.add(new Coordonnee(x, y + 1));
            }
        } else {
            if (((x + 1) >= 0 && (y - 1) >= 0 && (x + 1) < 8 && (y - 1) < 8) && (this.plateau.getpieceAt(x + 1, y - 1) != null) && this.plateau.getpieceAt(x + 1, y - 1).couleur.equals("Blanc")) {
                coords.add(new Coordonnee(x + 1, y - 1));
            }
            if (((x - 1) >= 0 && (y - 1) >= 0 && (x - 1) < 8 && (y - 1) < 8) && (this.plateau.getpieceAt(x - 1, y - 1) != null) && this.plateau.getpieceAt(x - 1, y - 1).couleur.equals("Blanc")) {
                coords.add(new Coordonnee(x - 1, y - 1));
            }
            if (y >= 2 && premierCoup && plateau.getpieceAt(x, y - 1) == null && plateau.getpieceAt(x, y - 2) == null) {
                coords.add(new Coordonnee(x, y - 1));
                coords.add(new Coordonnee(x, y - 2));
            }
            if (y > 0 && plateau.getpieceAt(x, y - 1) == null) {
                coords.add(new Coordonnee(x, y - 1));
            }
        }
        return coords;
    }
    public ArrayList<Coordonnee> porteDAttaque(){//
      if (this.couleur.equals("Blanc"))
     return(new ArrayList<Coordonnee>());
	return null;
    }
    /**
     * Detecte si le pion peut etre promu
     *
     * @return
     */
    /*public boolean isPromotion() {
        if (this.couleur.equals("Blanc") && this.y == 7) {
            return true;
        }
        if (this.couleur.equals("Noir") && this.y == 0) {
            return true;
        } else {
            return false;
        }
    }*/

    public boolean isPremierCoup() {
        return this.premierCoup;
    }
    

    /**
     * Setter du premierCoup
     */
    public void setPremierCoup(boolean b) {
        this.premierCoup = b;
    }
}