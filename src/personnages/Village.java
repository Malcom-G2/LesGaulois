package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }


    public void setChef(Chef chef) {
        this.chef = chef;
    }


    public void ajouterHabitant(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("Le village est plein !");
        }
    }

    public Gaulois trouverHabitant(int index) {
        if (index >= 0 && index < nbVillageois) {
            return villageois[index];
        } else {
            throw new IndexOutOfBoundsException("Aucun villageois à cet index !");
        }
    }

    public void afficherVillageois() {
        if (chef != null) {
            System.out.println("Chef du village : " + chef.getNom());
        }
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("Villageois : " + villageois[i].getNom());
        }
    }

    public String getNom() {
        return nom;
    }

    public static void main(String[] args) {
        Village village = new Village("Village des Irréductibles", 30);

        Chef abraracourcix = new Chef("Abraracourcix", 6);
        village.setChef(abraracourcix);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);

        village.afficherVillageois();
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(obelix);
        
        village.afficherVillageois();
    }
}
