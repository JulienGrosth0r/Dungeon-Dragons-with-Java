package gear.potions;

import character.PlayerCharacter;

public class SmallPotion extends Potion {
    public SmallPotion() {
        super("small potion", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You have found a " + getPotionName() + " !");
        System.out.println(this);
        playerCharacter.setHP(playerCharacter.getHP() + getHeal());
    }
}
