package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void boirePotion(int forcePotion) {
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
        return "Gaulois [nom=" + nom + ", force=" + force + "]";
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        asterix.boirePotion(6);
        
        Romain minus = new Romain("Minus", 6);
        asterix.frapper(minus);
    }
}


