import character.PlayerCharacter;
import gear.Interactable;

public class CaseVide implements Interactable {
    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("EMPTY");
    }
}