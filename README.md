# Le petit programmeur

j'�cris un texte tr�s int�ressant et important !

## � ne pas faire

Ne pas m'effacer s'il vous plait 

	public class Carte {
	Couleur couleur;
	int valeur;
	
	public Carte(Couleur couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}

	public Carte() {
		super();
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "[" + valeur +":"+ couleur + "]";
	}
	}