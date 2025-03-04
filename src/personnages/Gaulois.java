package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);

		System.out.println(asterix);
	}

	public void frapper(Romain romain) {
		int forceCoup = (force / 3);
		System.out.println(nom + " envoie un coup de force " + forceCoup + " à " + romain.getNom());
		romain.recevoirCoup(forceCoup);
	}

	@Override
	public String toString() {
		return nom;
	}

}