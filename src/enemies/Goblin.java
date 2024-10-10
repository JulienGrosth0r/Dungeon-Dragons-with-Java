package enemies;

import character.PlayerCharacter;

public class Goblin extends Enemy{
    public Goblin() {
        super("Goblin", 6, 1);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Goblin");
    }
}
