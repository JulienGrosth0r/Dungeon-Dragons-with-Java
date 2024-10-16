package gear.magicianGear;

import character.PlayerCharacter;
import gear.OffensiveGear;
import gear.warriorGear.IronSword;

public class FireBall extends OffensiveGear {

    public FireBall() {
        super("Fire Ball", 7, "Magician");
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the " + getName() + " spell, it's getting hot in here!");
        System.out.println(this);
        if (this.matchableOffensiveType.equals(playerCharacter.getType())) {
            playerCharacter.setOffensiveGear(new FireBall());
            System.out.println("You pick up: " + playerCharacter.getOffensiveGear().getName() + ".");
        } else {
            System.out.println("You cannot use this.");
        }
    }
}
