/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

/**
 *
 * @author susuf
 */
import java.util.Scanner;

public class Joueur {

    private String nom;      // le nom du joueur (pas de fonction directe pour l' instant a part la personnalisation et c' est sympa)
    private String couleur;  // defini la couleur (et donc les pieces du joueur)à la quelle le joueur est rattacher , c' est aussi son id  

    public void initJoueur(String couleur) { // permet d'initialiser les joueurs créés dans Jeu

        Scanner sc = new Scanner(System.in); //
        System.out.println("entré nom du joueur\n");
        String nom = sc.nextLine(); // nom du jouer Blanc
       this.setnom(nom);
       this.setcouleur(couleur);

        
        
        
    }

    public String getnom() {

        return (this.nom);
    }

   

    public String getcouleur() {

        return (this.couleur);
    }

    public void setnom(String s) {

        this.nom = s;
    }
    public void setcouleur(String s) {

        this.couleur = s;
    }

}
