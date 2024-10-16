package gear.warriorGear;

import character.PlayerCharacter;
import character.Warrior;
import gear.OffensiveGear;
import gear.magicianGear.FireBall;

public class WoodenClub extends OffensiveGear {
    public WoodenClub() {
        super("Wooden Club", 1, "Warrior");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a" + getName() + ".");
        System.out.println(this);
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new WoodenClub());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}

