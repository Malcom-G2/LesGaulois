package personnages;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    public Romain(String nom, int force) {
        assert force > 0 : "La force doit être positive";
        this.nom = nom;
        this.force = force;
    }

    public void recevoirCoup(int forceCoup) {
        assert force > 0 : "La force doit être positive avant le coup";
        int ancienneForce = force;
        force -= forceCoup;
        if (force > 0) {
            parler("Aïe !");
        } else {
            parler("J'abandonne...");
        }
        assert force < ancienneForce : "La force doit avoir diminué après le coup";
    }


    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    equipements[1] = equipement;
                    nbEquipement++;
                    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                }
                break;
            case 0:
                equipements[0] = equipement;
                nbEquipement++;
                System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                break;
        }
    }


    public void parler(String texte) {
        System.out.println("Le romain " + nom + " : « " + texte + " »");
    }

    public String getNom() {
        return nom;
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE); 

        minus.recevoirCoup(5);
    }
}

