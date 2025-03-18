package personnages;
import objets.Chaudron;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;

    public String getNom() {
		return nom;
	}
    
    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
        chaudron = new Chaudron();
    }
    

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }

    public void fabriquerPotion(int quantite, int forcePotion) {
        chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            if (chaudron.resterPotion()) {
                int effetPotion = chaudron.prendreLouche();
                gaulois.setEffetPotion(effetPotion);
                parler("Tiens " + gaulois.getNom() + ", un peu de potion magique.");
            } else {
                parler("Désolé, je n'ai plus de potion magique.");
            }
        }
    }
}
