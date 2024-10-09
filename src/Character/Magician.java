package Character;

import Gear.MagicianGear.Shockwave;
import Gear.MagicianGear.SmallMagicBubble;

public class Magician extends PlayerCharacter {
    public Magician() {
        super("Anonymous Player", "Magician");
        this.setHP(6);
        this.setAP(15);
        this.offensiveGear = new Shockwave();
        this.defensiveGear = new SmallMagicBubble();
    }
}
