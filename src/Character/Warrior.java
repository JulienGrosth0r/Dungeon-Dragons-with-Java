package Character;

import Gear.Protection;
import Gear.Weapon;

public class Warrior extends PlayerCharacter {
    public Warrior() {
        super("Anonymous Player", "Warrior");
        this.setHP(10);
        this.setAP(10);
        this.offensiveGear = new Weapon();  // Utiliser la classe Weapon
        this.defensiveGear = new Protection();  // Utiliser la classe Protection
    }
}
