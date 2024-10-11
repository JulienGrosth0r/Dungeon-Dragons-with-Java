package gear.magicianGear;

import character.PlayerCharacter;
import gear.OffensiveGear;

public class FireBall extends OffensiveGear {

    public FireBall() {
        super("Fire Ball", 7);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the Fireball spell, it's getting hot in here!");
        System.out.println(this);
    }
}
