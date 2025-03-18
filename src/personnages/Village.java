package personnages;

public class Village {
	private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    
    public Village(String nom,Gaulois chef,int nbVillageoisMaximum) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }
    
    public String getNom() {
		return nom;
	}
    
    public Gaulois getChef() {
		return chef;
	}
    
    public void ajouterHabitant(Gaulois gaulois) { 
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("Le village est plein !");
        }
    }
    
    public Gaulois trouverVillageois(int index) {
        if (index > 0 && index <= nbVillageois) {
            return villageois[index - 1];
        } 
        System.out.println("Il n'y a pas autant d'habitants dans notre village !");
        return null;
    }
    
    public void afficherVillageois() { 
        if (chef != null) {
            System.out.println("Chef du village : " + chef.getNom());
        }
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("Villageois : " + villageois[i].getNom());
        }
    }
    
    public static void main() {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles",abraracourcix, 30);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
	}
    
    
    
    
    
    
    
    
    

}
