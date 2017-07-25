package jeuDeCartes;

import java.util.List;

public class PartieApplication {

	public static void main(String[] args) {
		FabriqueDeck fabriqueDeck= new FabriqueDeck();
		
	
		List<Carte> mcartes1 = fabriqueDeck.genereDeck52Cartes();
		System.out.println(mcartes1.toString());
		
		List<Carte> mcartes2 = fabriqueDeck.genereDeck32Cartes();
		System.out.println(mcartes2.toString());
		
		Joueur joueur = new Joueur();
		joueur.setMain(mcartes2);
		Carte nouvelleCarte=joueur.donneCarte();
		System.out.println(nouvelleCarte);
	}

}
