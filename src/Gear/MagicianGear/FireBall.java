package Gear.MagicianGear;

import Character.PlayerCharacter;
import Gear.OffensiveGear;

public class FireBall extends OffensiveGear {

    public FireBall() {
        super("Fire Ball", 7);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Fireball");
    }
}
