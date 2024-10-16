package gear.magicianGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class LightningBolt extends OffensiveGear {
    public LightningBolt() {
        super("Lightning Bolt", 2, "Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the " + getName() + " spell, a most shocking experience!");
        System.out.println(this);
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new LightningBolt());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your AP of " + getAttackLevel() + "!");
            System.out.println("Your AP are now of " + playerCharacter.getAP() + " + " + getAttackLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
