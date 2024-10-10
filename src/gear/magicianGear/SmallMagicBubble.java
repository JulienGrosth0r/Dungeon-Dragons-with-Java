package gear.magicianGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class SmallMagicBubble extends DefensiveGear {
    public SmallMagicBubble() {
        super("Small Magic Bubble", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Small Magic Bubble");
    }
}