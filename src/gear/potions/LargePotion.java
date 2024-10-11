package gear.potions;

import character.PlayerCharacter;

public class LargePotion extends Potion {
    public LargePotion() {
        super("Large potion", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You have found a large potion!");
        System.out.println(this);
    }
}
