package jeuDeCartes;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

		List<Carte> main= new ArrayList<>();
		
		public List<Carte> getMain() {
			return main;
		}

		public void setMain(List<Carte> main) {
			this.main = main;
		}

		public void prendCarte(Carte carte){
			main.add(carte);
		}
		
		public Carte donneCarte(){
			Carte carteChoisi=new Carte();
			carteChoisi=main.remove(0);
			//System.out.println(carteChoisi);
			return carteChoisi;
		}


}
