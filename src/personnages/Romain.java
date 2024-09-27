package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            System.out.println("Le romain " + nom + " : « Aïe »");
        } else {
            System.out.println("Le romain " + nom + " : « J'abandonne...»");
        }
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
        minus.recevoirCoup(4);  // Simulating a hit
    }
}

