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
        String autorisation=verifier(x,y);
        switch (autorisation){
            case "rien":
                plateau.suppieceAt(this.x,this.y);
                this.setx(x);
                this.sety(y);
                plateau.setpieceAt(x, y, this);
                break;
            case "Enemi":
               
                this.bataille(plateau.getplateau()[x][y]);
                break;
        }
        
    }
    
    public String verifier(int x , int y ){// verifie si on peut poser la piece (libre ou occupé par piece ennemie )
        
        Piece caseScanner=plateau.getpieceAt(x, y);
        String result="rien";
        if(caseScanner.getcouleur()!= this.getcouleur()){
             result="Enemi";
        }else if(caseScanner.getcouleur()== this.getcouleur()){
             result="Allier";
        }
        return (result);
    }
    public void bataille(Piece autrePiece){ // va appliquer les changements de stats (combat)
        int bonnusAttaque=7;// redéfinir
        int pionAttaquantPA=this.getpointDAttaque()+bonnusAttaque;
        int pionAttaquantPD=this.getpointDeDefense();
        int pionAttaquantPV=this.getpointDevie();
        int pionDefPA=autrePiece.getpointDAttaque();
        int pionDefPD=autrePiece.getpointDeDefense();
        int pionDefPV=autrePiece.getpointDevie();
        int degatsurDefenseur=pionAttaquantPA-pionDefPD;
        if (degatsurDefenseur<0){
            degatsurDefenseur=0;
        }
        int degatsurAttaquant=pionDefPA-pionAttaquantPD;
        if (degatsurAttaquant<0){
            degatsurAttaquant=0;
        }
        pionDefPV-=degatsurDefenseur;
        pionAttaquantPV-=degatsurAttaquant;
        autrePiece.setpointDeVie(pionDefPV);
        this.setpointDeVie(pionAttaquantPV);
        if (autrePiece.getpointDevie()<=0 && this.getpointDevie()>0){
            int x=autrePiece.getx();
            int y=autrePiece.gety();
            plateau.suppieceAt(x,y);
            autrePiece.setx(-1);
            autrePiece.sety(-1);
            this.setx(x);
            this.sety(y);
            plateau.setpieceAt(x, y, this);//ajoute la pièce dans le plateau à la place de la pièce attaqué
            /*ajout de la piéce vaincu à la prisont de l'attaquant*/
            /*Battaille Gagner*/
        }
        if(autrePiece.getpointDevie()>0 &&this.getpointDevie()<=0){
            plateau.suppieceAt(this.x, this.y);
            this.setx(-1);
            this.sety(-1);
            /*ajoute la pièce de l'attaquant dans la prisont du défenseur*/
        }
        if(autrePiece.getpointDevie()<=0 &&this.getpointDevie()<=0){
            plateau.suppieceAt(this.x, this.y);
            this.setx(-1);
            this.sety(-1);
            plateau.suppieceAt(autrePiece.x, autrePiece.y);
            autrePiece.setx(-1);
            autrePiece.sety(-1);
        }
        
    } 
    public static void bataille(Piece piece1, Piece piece2){// va appliquer les changements de stats (combat)
    
    } 
    
    public ArrayList<int [][]> deplacementPossible(){//
    
     return(null);
    
    }
    public ArrayList<int [][]> porteDAttaque(){//
    
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
