package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
    public static void main(String[] args) {
        Druide panoramix = new Druide(5, 10);
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 25);
        Romain minus = new Romain("Minus", 6);

        System.out.println("Le druide Panoramix : � Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 � 10.�");
        System.out.println("Le druide Panoramix : � Je vais aller pr�parer une petite potion...�");
        panoramix.preparerPotion();

        System.out.println("Le druide Panoramix : � Non, Ob�lix !... Tu n'auras pas de potion magique !�");
        System.out.println("Le gaulois Ob�lix : � Par B�l�nos, ce n'est pas juste !�");

        panoramix.booster(asterix);

        System.out.println("Le gaulois Ast�rix : � Bonjour�");
        System.out.println("Le romain Minus : � UN GAU... UN GAUGAU...�");
        asterix.frapper(minus);
        System.out.println("Le romain Minus : � J'abandonne...�");
    }
}
