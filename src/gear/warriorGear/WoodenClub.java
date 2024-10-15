package gear.warriorGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class WoodenClub extends OffensiveGear {
    public WoodenClub() {
        super("Wooden Club", 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Wooden Club");
    }
}

