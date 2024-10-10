package character;

import gear.warriorGear.WoodenClub;
import gear.warriorGear.WoodenShield;

public class Warrior extends PlayerCharacter {
    public Warrior() {
        super("Anonymous Player", "Warrior");
        this.setHP(10);
        this.setAP(10);
        this.offensiveGear = new WoodenClub();
        this.defensiveGear = new WoodenShield();
    }
}
