package Gear.MagicianGear;

import Character.PlayerCharacter;
import Gear.DefensiveGear;

public class MagicBubble extends DefensiveGear {
    public MagicBubble() {
        super("Magic Bubble", 4);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Magic Bubble");
    }
}
