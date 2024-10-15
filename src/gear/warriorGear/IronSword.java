package gear.warriorGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class IronSword extends OffensiveGear {

    public IronSword() {
        super("Iron Sword", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found an " + getName() + "! Sharp as a razor.");
        System.out.println(this);
    }
}