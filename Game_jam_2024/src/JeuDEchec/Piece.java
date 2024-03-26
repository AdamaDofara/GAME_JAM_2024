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
public class Piece {
    protected boolean vide;
    protected int pointDeVie;
    protected int pointDAttaque;
    protected int pointDeDefense;
    protected String couleur;
    protected Plateau plateau;
    protected int x;
    protected int y;

    public Piece(int pDv, int pDa, int pDd, String c, Plateau p, int x, int y) {
        this.vide=false;
        this.pointDeVie = pDv;
        this.pointDAttaque = pDa;
        this.pointDeDefense = pDd;
        this.couleur = c;
        this.plateau = p;
        this.x = x;
        this.y = y;

    }
    
    
    public void deplacer(int x , int y ){
    }
    
    public boolean verifier(int x , int y ){// verifie si on peut poser la piece (libre ou occupé par piece ennemie )
        return result;
    }
    public void bataille(Piece autrePiece){ // va appliquer les changements de stats (combat)
    
    } 
    public static void bataille(Piece piece1, Piece piece2){// va appliquer les changements de stats (combat)
    
    } 
    
    public ArrayList<int [][]> deplacementPossible(){//
    
     return(null);
    
    }
    public ArrayList<int [][]> porteDAttaque(){// Guillaume 2024:"c est comme deplacementPossible()"
    
     return(null);
    
    }
    
    
    

    public int getpointDevie() {

        return (this.pointDeVie);

    }

    public int getpointDAttaque() {

        return (this.pointDAttaque);

    }

    public int getpointDeDefense() {

        return (this.pointDeDefense);

    }

    public String getcouleur() {

        return (this.couleur);

    }

    public Plateau getplateau() {

        return (this.plateau);

    }

    public int getx() {

        return (this.x);

    }

    public int gety() {

        return (this.y);

    }
    
    public void setpointDeVie(int pDv) {

       this.pointDeVie = pDv;

    }
    public void setpointDAttaque(int pDa) {

       this.pointDAttaque = pDa;

    }
    public void setpointDeDefense(int pDd) {

       this.pointDeDefense = pDd;

    }
    public void setcouleur(String c) {

       this.couleur = c;

    }
    public void setplateau(Plateau p) {

       this.plateau = p;

    }
    public void setx(int x) {

       this.x = x;
     
    }
    public void sety(int y) {

       this.y = y;
     
    }
}
