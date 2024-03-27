/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Adama && Kenny
 */

  




/**
 * Defini le comportement de la Tour
 */
public class Tour extends Piece{
	
	public ArrayList<Coordonnee>deplacementPossible (){
    	int x = this.x+1;
    	int y = this.y;
    	ArrayList<Coordonnee> possible = new ArrayList<Coordonnee>();
    	while(x<8 && x>=0 && y>=0&& y<8 && verifier(x, y)=="rien" || verifier( x,  y)=="Enemi" && (plateau.getpieceAt(x, y) == null || plateau.getpieceAt(x, y).getcouleur() != this.getcouleur())){
    		possible.add(new Coordonnee(x,y));
    		x++;
    	}
    	x = this.x-1;
    	
    	while(x<8 && x>=0 && y>=0&& y<8 && verifier(x, y)=="rien" || verifier( x,  y)=="Enemi" && (plateau.getpieceAt(x, y) == null || plateau.getpieceAt(x, y).getcouleur() != this.getcouleur())){
    		possible.add(new Coordonnee(x,y));
    		x--;
    	}
    	x = this.x;
    	y = this.y+1;
    	while(x<8 && x>=0 && y>=0&& y<8 && verifier(x, y)=="rien" || verifier( x,  y)=="Enemi" && (plateau.getpieceAt(x, y) == null || plateau.getpieceAt(x, y).getcouleur() != this.getcouleur())){
    		possible.add(new Coordonnee(x,y));
    		y++;
    	}
    	x = this.x;
    	y = this.y-1;
    	while(x<8 && x>=0 && y>=0&& y<8 && verifier(x, y)=="rien" || verifier( x,  y)=="Enemi" && (plateau.getpieceAt(x, y) == null || plateau.getpieceAt(x, y).getcouleur() != this.getcouleur())){
    		possible.add(new Coordonnee(x,y));
    		y--;
    	}
    	return possible;
    }
	
       public Tour(int pDv, int pDa, int pDd, String c, Plateau p, int x, int y) {
       
        super(pDv, pDa, pDd, c, p, x, y);

    }
 
        
        
        
        
        
        
	public void archerTour() { // tire une "fleche" sur la cible 
       Scanner sc = new Scanner(System.in);
       System.out.println("Entrez une la coordonnnee en x ");
           
       int x = sc.nextInt();
       
       System.out.println("Entrez une la coordonnnee en y ");
       int y =sc.nextInt();
       Coordonnee cible= new Coordonnee(x,y);
       ArrayList<Coordonnee> ciblepossible= new ArrayList<Coordonnee>(); 
       ciblepossible= this.deplacementPossible();
       
    }

}

