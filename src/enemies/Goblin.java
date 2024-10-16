package enemies;

import character.PlayerCharacter;

public class Goblin extends Enemy {
    public Goblin() {
        super("Goblin", 6, 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You encounter a Goblin! Easy peasy!");
        System.out.println(this);
        playerCharacter.setHP((playerCharacter.getHP() + playerCharacter.getDefensiveGear().getDefenceLevel()) - getEnemyAP());
        setEnemyHP(getEnemyHP() - (playerCharacter.getAP() + playerCharacter.getOffensiveGear().getAttackLevel()));
    }
}
