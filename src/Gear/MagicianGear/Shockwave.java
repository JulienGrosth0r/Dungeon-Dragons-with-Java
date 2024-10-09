package Gear.MagicianGear;

import Character.PlayerCharacter;
import Gear.OffensiveGear;

public class Shockwave extends OffensiveGear {
    public Shockwave() {
        super("Shockwave", 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Shockwave");
    }
}
