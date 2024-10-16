package gear.magicianGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class MagicBubble extends DefensiveGear {
    public MagicBubble() {
        super("Magic Bubble", 4,"Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the " + getName() + " spell, perfect for deflecting enemy attacks.");
        System.out.println(this);
        if (this.matchableDefensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setDefensiveGear(new MagicBubble());
            System.out.println("You pick up: " + playerCharacter.getDefensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your HP of " + getDefenceLevel() + "!");
            System.out.println("Your HP are now of " + playerCharacter.getHP() + " + " + getDefenceLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
