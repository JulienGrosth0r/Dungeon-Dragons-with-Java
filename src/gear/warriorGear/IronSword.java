package gear.warriorGear;

import character.PlayerCharacter;
import gear.OffensiveGear;
import gear.magicianGear.FireBall;

public class IronSword extends OffensiveGear {

    public IronSword() {
        super("Iron Sword", 5, "Warrior");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found an " + getName() + "! Sharp as a razor.");
        System.out.println(this);
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new IronSword());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}