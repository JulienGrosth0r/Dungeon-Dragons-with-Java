package Gear.WarriorGear;

import Character.PlayerCharacter;
import Gear.OffensiveGear;

public class IronSword extends OffensiveGear {

    public IronSword() {
        super("Iron Sword", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am an Iron Sword");
    }
}