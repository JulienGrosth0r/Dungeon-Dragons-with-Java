package gear.warriorGear;

import character.PlayerCharacter;
import gear.DefensiveGear;
import gear.magicianGear.MagicBubble;

public class IronShield extends DefensiveGear {
    public IronShield() {
        super("Iron Shield", 5, "Warrior");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found an " + getName() + ", made of the ironest...iron?");
        System.out.println(this);
        if (this.matchableDefensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setDefensiveGear(new IronShield());
            System.out.println("You pick up: " + playerCharacter.getDefensiveGear().getName() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
