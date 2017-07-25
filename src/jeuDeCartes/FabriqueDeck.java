package jeuDeCartes;

import java.util.ArrayList;
import java.util.List;

public class FabriqueDeck {

	Couleur couleur;
	int valeur1;
	int valeur2;
	List<Carte> mcartes1 = new ArrayList<>();
	List<Carte> mcartes2 = new ArrayList<>();
	
	public  List<Carte> genereDeck52Cartes() {
		
		int tailleInitiale=52;
		valeur1=tailleInitiale/4+1;
			
			for(Couleur couleur : Couleur.values()){
				for(int i=2;i<=valeur1;i++){
				Carte cartes = new Carte(couleur,i);
				mcartes1.add(cartes);
				}
		}
		return mcartes1;
	}

	public List<Carte> genereDeck32Cartes() {
		int tailleInitiale=32;
		valeur2=tailleInitiale/4+1;
			
			for(Couleur couleur : Couleur.values()){
				for(int i=7;i<=5+valeur2;i++){
				Carte cartes = new Carte(couleur,i);
				mcartes2.add(cartes);
				}
		}
		return mcartes2;
	}
}
