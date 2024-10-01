package personnages;

import java.util.Random;

public class Druide {
    private int effetPotionMin;
    private int effetPotionMax;
    private int forcePotion = 1;


    public Druide(int effetPotionMin, int effetPotionMax) {
        assert effetPotionMin > 0 : "L'effet minimum de la potion doit être positif";
        assert effetPotionMax > effetPotionMin : "L'effet maximum de la potion doit être supérieur à l'effet minimum";
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
    }


    public void preparerPotion() {
        Random random = new Random();
        forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        if (forcePotion > 7) {
            System.out.println("J'ai préparé une super potion de force " + forcePotion);
        } else {
            System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
        }
    }

    public void booster(Gaulois gaulois) {
        if ("Obélix".equals(gaulois.getNom())) {
            System.out.println("Non, Obélix !... Tu n'auras pas de potion magique !");
        } else {
            preparerPotion();
            gaulois.boirePotion(forcePotion);
        }
    }


    public static void main(String[] args) {
        Druide panoramix = new Druide(5, 10);
        panoramix.preparerPotion();

        Gaulois asterix = new Gaulois("Astérix", 8);
        panoramix.booster(asterix);

        Gaulois obelix = new Gaulois("Obélix", 25);
        panoramix.booster(obelix);
    }
}


