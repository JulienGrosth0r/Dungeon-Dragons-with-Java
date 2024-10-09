package Enemies;

import Character.PlayerCharacter;

public class Dragon extends Enemy{
    public Dragon() {
        super("Dragon", 15, 4);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Dragon");
    }
}
