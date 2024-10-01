package personnages;

import java.util.Random;

public class Druide {
    private int effetPotionMin;
    private int effetPotionMax;
    private int forcePotion = 1;


    public Druide(int effetPotionMin, int effetPotionMax) {
        assert effetPotionMin > 0 : "L'effet minimum de la potion doit �tre positif";
        assert effetPotionMax > effetPotionMin : "L'effet maximum de la potion doit �tre sup�rieur � l'effet minimum";
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
    }


    public void preparerPotion() {
        Random random = new Random();
        forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        if (forcePotion > 7) {
            System.out.println("J'ai pr�par� une super potion de force " + forcePotion);
        } else {
            System.out.println("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
        }
    }

    public void booster(Gaulois gaulois) {
        if ("Ob�lix".equals(gaulois.getNom())) {
            System.out.println("Non, Ob�lix !... Tu n'auras pas de potion magique !");
        } else {
            preparerPotion();
            gaulois.boirePotion(forcePotion);
        }
    }


    public static void main(String[] args) {
        Druide panoramix = new Druide(5, 10);
        panoramix.preparerPotion();

        Gaulois asterix = new Gaulois("Ast�rix", 8);
        panoramix.booster(asterix);

        Gaulois obelix = new Gaulois("Ob�lix", 25);
        panoramix.booster(obelix);
    }
}


