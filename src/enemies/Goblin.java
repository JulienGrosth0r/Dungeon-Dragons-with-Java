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
        setEnemyHP(getEnemyHP() - (playerCharacter.getAP() + playerCharacter.getOffensiveGear().getAttackLevel()));
        if (this.getEnemyHP() > 0) {
            playerCharacter.setHP((playerCharacter.getHP() + playerCharacter.getDefensiveGear().getDefenceLevel()) - getEnemyAP());
        }
    }
}
