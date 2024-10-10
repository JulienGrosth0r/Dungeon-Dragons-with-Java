package enemies;

import character.PlayerCharacter;

public class Sorcerer extends Enemy{
    public Sorcerer() {
        super("Sorcerer", 9, 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Sorcerer");
    }
}
