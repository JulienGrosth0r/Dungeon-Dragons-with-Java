package gear.warriorGear;

import character.PlayerCharacter;
import gear.DefensiveGear;
import gear.magicianGear.MagicBubble;

public class WoodenShield extends DefensiveGear {
    public WoodenShield() {
        super("Wooden Shield", 1, "Warrior");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a " + getName() + ".");
        System.out.println(this);
        if (this.matchableDefensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setDefensiveGear(new WoodenShield());
            System.out.println("You pick up: " + playerCharacter.getDefensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your HP of " + getDefenceLevel() + "!");
            System.out.println("Your HP are now of " + playerCharacter.getHP() + " + " + getDefenceLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
