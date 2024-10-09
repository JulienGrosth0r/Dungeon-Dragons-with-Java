package Gear.MagicianGear;

import Character.PlayerCharacter;
import Gear.OffensiveGear;

public class LightningBolt extends OffensiveGear {
    public LightningBolt() {
        super("Lightning Bolt", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Lightning Bolt");
    }
}
