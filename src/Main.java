public class Main {
    public static void main(String[] args) {
        // Appel des méthodes du menu pour obtenir le nom et le type du joueur
        String userName = Menu.getUserNameOfThePlayer();
        String playerType = Menu.getTypeOfThePlayer();

        // Créer un PlayerCharacter avec les informations obtenues du menu
        PlayerCharacter player = new PlayerCharacter(userName, playerType);

        // Afficher les informations du joueur
        System.out.println(player);

        PlayerCharacter PlayerCharacter = new PlayerCharacter();
        String menuOfGame = Menu.gameMenu(PlayerCharacter, player);

        System.out.println(menuOfGame);
    }
}
