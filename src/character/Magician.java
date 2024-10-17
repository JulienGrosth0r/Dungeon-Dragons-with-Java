package character;

import gear.magicianGear.Shockwave;
import gear.magicianGear.SmallMagicBubble;

public class Magician extends PlayerCharacter {
    public Magician(String name) {
        super(name, "Magician");
        int initialAP = Math.random() < 0.5 ? 8 : 15;
        this.setAP(initialAP); // Définit les AP initiaux à 8 ou 15
        int initialHP = Math.random() < 0.5 ? 3 : 6;
        this.setHP(initialHP);  // Définit les HP initiaux à 3 ou 6
        this.offensiveGear = new Shockwave();
        this.defensiveGear = new SmallMagicBubble();
    }
}
