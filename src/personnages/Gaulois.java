package personnages;

public class Gaulois {
    private String nom;
    //private int force;
    private int effetPotion = 1;
    
    //TP3 ajout
    private int force, nb_trophees;
    private Equipement trophees[] = new Equipement[100];



    public Gaulois(String nom, int force) {
        assert force > 0 : "La force doit être positive";
        this.nom = nom;
        this.force = force;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void parler(String texte) {
    	System.out.println(prendreParole() + "« " + texte + "»");
    }
    
    //TP3 ajout
    
    private String prendreParole() {
    	String texte = "Le gaulois " + nom + " : ";
    	return texte;
    }
    
    
    
    //ancienne methode prendreParole
//    private String prendreParole() {
//    	return "Le gaulois " + nom + " : ";
//    }


    public void boirePotion(int forcePotion) {
        assert forcePotion > 0 : "La force de la potion doit être positive";
        effetPotion = forcePotion;
        System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
    }

    public void frapper(Romain romain) {
        int forceCoup = (force / 3) * effetPotion;
        System.out.println(nom + " envoie un coup de force " + forceCoup + " à " + romain.getNom());
        romain.recevoirCoup(forceCoup);
    }

    @Override
    public String toString() {
        return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
    }


    public static void main(String[] args) {

        Gaulois asterix = new Gaulois("Astérix", 8);
        asterix.boirePotion(6);


        Romain minus = new Romain("Minus", 6);
        asterix.frapper(minus);
    }
}



