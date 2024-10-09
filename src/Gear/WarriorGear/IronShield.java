package Gear.WarriorGear;

import Character.PlayerCharacter;
import Gear.DefensiveGear;

public class IronShield extends DefensiveGear {
    public IronShield() {
        super("Iron Shield", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am an Iron Shield");
    }
}
