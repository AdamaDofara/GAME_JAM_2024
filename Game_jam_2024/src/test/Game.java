package test;

import java.util.LinkedList;
import java.util.Scanner;

import JeuDEchec.Piece;
import JeuDEchec.Plateau;
import JeuDEchec.Roi;

public class Game {
	public static final int BLACK = 0;
	public static final int WHITE = 1;
	public final int xBlkKing = 1;
	public final int yBlkKing = 5;
	public final int xWhtKing = 0;
	public final int yWhtKing = 7;
	
	private int currentPlayer;
	private Plateau plateau = new Plateau();
	private LinkedList<Piece> blackPieces;
	private LinkedList<Piece> whitePieces;
	private Roi blackKing;
	private Roi whiteKing;
	Scanner clavier = new Scanner(System.in);
	
	
	public void gameLoop() {
		plateau.initPlateau(plateau);
		plateau.afficherPlateau();
		boolean continuegame = true;
		while(continuegame) {
		System.out.println("Quelle pièce voulez vous bougez? abscisse x: ");
		int x = clavier.nextInt();
		System.out.println("ordonnee y:");
		int y = clavier.nextInt();
		
		Piece piece = plateau.getpieceAt(x, y);
		if (piece == null) {
			System.out.println("Position invalide");
		}
		else {
			System.out.println("ou voulez vous deplacer la piece abscisse x: ");
			x = clavier.nextInt();
			System.out.println("Ordonne y:");
			y =  clavier.nextInt();
				piece.deplacer(x, y);
				plateau.afficherPlateau();
		}
		if (!plateau.roiEstVivant("Blanc") || !plateau.roiEstVivant("Noir")) {
			continuegame = false;
		}
		}
		
		System.err.println("GAME OVER");
		plateau.afficherPlateau();
	}
	

	
	
	
}
