package gear.potions;

import character.PlayerCharacter;

public class LargePotion extends Potion {
    public LargePotion() {
        super("Large potion", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Large Potion");
    }
}
