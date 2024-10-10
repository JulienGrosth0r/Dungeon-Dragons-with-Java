package gear.warriorGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class WoodenShield extends DefensiveGear {
    public WoodenShield() {
        super("Wooden Shield", 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Wooden Shield");
    }
}
