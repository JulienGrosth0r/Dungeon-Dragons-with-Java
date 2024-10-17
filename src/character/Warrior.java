package character;

import gear.warriorGear.WoodenClub;
import gear.warriorGear.WoodenShield;

public class  Warrior extends PlayerCharacter {
    public Warrior(String name) {
        super(name, "Warrior");
        int initialAP = Math.random() < 0.5 ? 5 : 10;
        this.setAP(initialAP); // Définit les AP initiaux à 5 ou 10
        int initialHP = Math.random() < 0.5 ? 5 : 10;
        this.setHP(initialHP);  // Définit les HP initiaux à 5 ou 10
        this.offensiveGear = new WoodenClub();
        this.defensiveGear = new WoodenShield();
    }
}
