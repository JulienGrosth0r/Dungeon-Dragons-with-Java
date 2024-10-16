package gear.magicianGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class SmallMagicBubble extends DefensiveGear {
    public SmallMagicBubble() {
        super("Small Magic Bubble", 2,"Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a " + getName() + ".");
        System.out.println(this);
        if (this.matchableDefensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setDefensiveGear(new SmallMagicBubble());
            System.out.println("You pick up: " + playerCharacter.getDefensiveGear().getName() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
