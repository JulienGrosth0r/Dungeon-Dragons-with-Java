package gear.warriorGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class Mace extends OffensiveGear {
    public Mace() {
        super("Mace", 3);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Mace");
    }
}
