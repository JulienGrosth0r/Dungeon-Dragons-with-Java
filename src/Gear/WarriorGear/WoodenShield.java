package Gear.WarriorGear;

import Character.PlayerCharacter;
import Gear.DefensiveGear;

public class WoodenShield extends DefensiveGear {
    public WoodenShield() {
        super("Wooden Shield", 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Wooden Shield");
    }
}
