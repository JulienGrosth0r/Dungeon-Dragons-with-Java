package enemies;

import character.PlayerCharacter;

public class Sorcerer extends Enemy {
    public Sorcerer() {
        super("Sorcerer", 9, 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You encounter a Sorcerer, watch out!");
        System.out.println(this);
        playerCharacter.setHP(playerCharacter.getHP() - getEnemyAP());
        setEnemyHP(playerCharacter.getAP() - getEnemyHP());
    }
}
