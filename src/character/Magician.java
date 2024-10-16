package character;

import gear.magicianGear.Shockwave;
import gear.magicianGear.SmallMagicBubble;

public class Magician extends PlayerCharacter {
    public Magician(String name) {
        super(name, "Magician", 15);
        this.setHP(6);
        this.offensiveGear = new Shockwave();
        this.defensiveGear = new SmallMagicBubble();
    }
}
