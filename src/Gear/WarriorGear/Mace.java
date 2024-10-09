package Gear.WarriorGear;

import Character.PlayerCharacter;
import Gear.OffensiveGear;

public class Mace extends OffensiveGear {
    public Mace() {
        super("Mace", 3);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Mace");
    }
}
