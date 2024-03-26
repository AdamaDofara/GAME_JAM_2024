/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

/**
 *
 * @author susuf
 */
public class Jeu {
    private Joueur jB; // joueur au piece noir 
    private Joueur jN;// joueur au piece white
    private Plateau table;
    
    
    public void  initJeu(){//methode pour demarer tout le jeu 
         jB = new Joueur();
         jN = new Joueur();
         table= new Plateau();
         this.jB.initJoueur("Blanc");
         this.jN.initJoueur("Noir");
         this.table.initPlateau(table);
    }
    
    
    
    
}
