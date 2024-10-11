package gear.potions;

import character.PlayerCharacter;

public class SmallPotion extends Potion {
    public SmallPotion() {
        super("Small Potion", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You have found a small potion!");
        System.out.println(this);
    }
}
