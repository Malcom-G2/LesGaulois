package personnages;

public class Romain {
    //TP3 ajout
    private String texte;
    
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    public Romain(String nom, int force) {
        assert force > 0 : "La force doit �tre positive";
        this.nom = nom;
        this.force = force;
    }
    
    //TP3 ajout
    public Equipement[] recevoirCoup(int forceCoup) {
    	Equipement[] equipementEjecte = null;
    	// pr�condition
    	assert force > 0;
    	int oldForce = force;
    	forceCoup = CalculResistanceEquipement(forceCoup);
    	force -= forceCoup;
    	// if (force > 0) {
    	// parler("A�e");
    	// } else {
    	// equipementEjecte = ejecterEquipement();
    	// parler("J'abandonne...");
    	// }
    	switch (force) {
    	case 0:
    		parler("A�e");
    	default:
    		equipementEjecte = ejecterEquipement();
    		parler("J'abandonne...");
    		break;
    	}
    	// post condition la force a diminu�e
    	assert force < oldForce;
    	return equipementEjecte;
    }

    private int CalculResistanceEquipement(int forceCoup) {
    	texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
    	int resistanceEquipement = 0;
    	if (!(nbEquipement == 0)) {
    		texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
    		for (int i = 0; i < nbEquipement;) {
    			if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
    				resistanceEquipement += 8;
    			} else {
    				System.out.println("Equipement casque");
    				resistanceEquipement += 5;
    			}
    			i++;
    		}
    		texte =+ resistanceEquipement + "!";
    	}
    	parler(texte);
    	forceCoup -= resistanceEquipement;
    	return forceCoup;
    	}
    	private Equipement[] ejecterEquipement() {
    		Equipement[] equipementEjecte = new Equipement[nbEquipement];
    		System.out.println("L'�quipement de " + nom.toString() + "s'envole sous la force du coup.");
    		//TODO
    		int nbEquipementEjecte = 0;
    		for (int i = 0; i < nbEquipement; i++) {
    		if (equipements[i] == null) {
    			continue;
    			} else {
    				equipementEjecte[nbEquipementEjecte] =
    						equipements[i];
    				nbEquipementEjecte++;
    				equipements[i] = null;
    			}
    	}
    			return equipementEjecte;
    	}

    
    
    //TP3 FIN ajout + recevoirCoup commenter
//    public void recevoirCoup(int forceCoup) {
//        assert force > 0 : "La force doit �tre positive avant le coup";
//        int ancienneForce = force;
//        force -= forceCoup;
//        if (force > 0) {
//            parler("A�e ! Ma force est maintenant de " + force);
//        } else {
//            parler("J'abandonne...");
//        }
//        assert force < ancienneForce : "La force doit avoir diminu� apr�s le coup";
//    }

    
    
    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement + " !");
                } else {
                    equipements[1] = equipement;
                    nbEquipement++;
                    System.out.println("Le soldat " + nom + " s'�quipe avec un " + equipement + ".");
                }
                break;
            case 0:
                equipements[0] = equipement;
                nbEquipement++;
                System.out.println("Le soldat " + nom + " s'�quipe avec un " + equipement + ".");
                break;
        }
    }

    public void parler(String texte) {
        System.out.println("Le romain " + nom + " : � " + texte + " �");
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

        //minus.recevoirCoup(5);
    }
}


