package gear.potions;

import character.PlayerCharacter;

public class LargePotion extends Potion {
    public LargePotion() {
        super("large potion", 5);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You have found a " + getPotionName() + " !");
        System.out.println(this);
        playerCharacter.setHP(playerCharacter.getHP() + getHeal());
    }
}
