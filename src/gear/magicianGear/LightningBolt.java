package gear.magicianGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class LightningBolt extends OffensiveGear {
    public LightningBolt() {
        super("Lightning Bolt", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the Lightning Bolt spell, a most shocking experience!");
        System.out.println(this);
    }
}
