import java.util.Objects;
import character.PlayerCharacter;
import character.Magician;
import character.Warrior;

public class Main {
    public static void main(String[] args) {
        // Créer une instance du menu
        Menu menu = new Menu();

        // Obtenir le nom et le type de personnage depuis le menu
        String playerName = menu.getUserNameOfThePlayer();
        String playerType = menu.getTypeOfThePlayer();

        // Instancier le bon type de personnage en fonction du choix de l'utilisateur
        PlayerCharacter player;
        if (Objects.equals(playerType, "Warrior")) {
            player = new Warrior();
        } else {
            player = new Magician();
        }

        // Mettre à jour le PlayerCharacter avec le nom
        player.setName(playerName);
        menu.setPlayer(player);

        // Démarrer le menu du jeu
        menu.gameMenu();
    }
}