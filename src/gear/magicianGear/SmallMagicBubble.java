package gear.magicianGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class SmallMagicBubble extends DefensiveGear {
    public SmallMagicBubble() {
        super("Small Magic Bubble", 2, "Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a " + getName() + ".");
        System.out.println(this);
        if (this.matchableDefensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setDefensiveGear(new SmallMagicBubble());
            System.out.println("You pick up: " + playerCharacter.getDefensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your HP of " + getDefenceLevel() + "!");
            System.out.println("Your HP are now of " + playerCharacter.getHP() + " + " + getDefenceLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
