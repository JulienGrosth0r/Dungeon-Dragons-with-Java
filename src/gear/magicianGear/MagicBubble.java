package gear.magicianGear;

import character.PlayerCharacter;
import gear.DefensiveGear;

public class MagicBubble extends DefensiveGear {
    public MagicBubble() {
        super("Magic Bubble", 4);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You found the Magic Bubble spell, perfect for deflecting enemy attacks.");
        System.out.println(this);
    }
}
