package enemies;

import character.PlayerCharacter;

public class Dragon extends Enemy{
    public Dragon() {
        super("Dragon", 15, 4);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("You encounter a fearsome Dragon, brace yourself!");
        System.out.println(this);
    }
}
