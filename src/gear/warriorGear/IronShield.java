package gear.warriorGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class IronShield extends DefensiveGear {
    public IronShield() {
        super("Iron Shield", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found an Iron Shield, made of the ironest...iron?");
        System.out.println(this);
    }
}
