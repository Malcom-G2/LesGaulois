package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effectPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParol() + "« " + texte + "»");
	}
	
	private String prendreParol() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de" + romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effectPotion=" + effectPotion + "]";
	}
	
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaulois
	}
		
	}

}
