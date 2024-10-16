package gear.magicianGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class Shockwave extends OffensiveGear {
    public Shockwave() {
        super("Shockwave", 1,"Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a " + getName() + " spell. Whoosh.");
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new Shockwave());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
            System.out.println("The " + getName() + " increases your AP of " + getAttackLevel() + "!");
            System.out.println("Your AP are now of " + playerCharacter.getAP() + " + " + getAttackLevel() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
