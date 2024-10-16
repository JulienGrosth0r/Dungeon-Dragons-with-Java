package gear.warriorGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class Mace extends OffensiveGear {
    public Mace() {
        super("Mace", 3, "Warrior");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found a " + getName() + ", perfect for beating enemies to a pulp.");
        System.out.println(this);
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new Mace());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your AP of " + getAttackLevel() + "!");
            System.out.println("Your AP are now of " + playerCharacter.getAP() + " + " + getAttackLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }    }
}
