package Character;

import Gear.ProtectiveSpell;
import Gear.Spell;

public class Magician extends PlayerCharacter {
    public Magician() {
        super("Anonymous Player", "Magician");
        this.setHP(6);
        this.setAP(15);
        this.offensiveGear = new Spell();  // Utiliser la classe Spell
        this.defensiveGear = new ProtectiveSpell();  // Utiliser la classe ProtectiveSpell
    }
}
