public class Main {
    public static void main(String[] args) {
        // Créer un personnage par défaut
        PlayerCharacter player = new PlayerCharacter();

        // Créer une instance du menu en passant le joueur
        Menu menu = new Menu();

        // Obtenir le nom et le type de personnage depuis le menu
        String playerName = menu.getUserNameOfThePlayer();
        String playerType = menu.getTypeOfThePlayer();
        player = new PlayerCharacter(playerName, playerType);
        menu.setPlayer(player);

        // Mettre à jour le PlayerCharacter avec le nom et le type
        player.setName(playerName);
        player.setType(playerType);

        // Démarrer le menu du jeu
        menu.gameMenu();

        // Instancier la classe Game pour le lancer de dé
        Game game = new Game();
        game.rollDie();  // Simuler le lancer de dé
    }
}
