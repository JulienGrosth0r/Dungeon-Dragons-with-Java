import java.util.Scanner;

public class Menu {

    // Attributs privés
    private Scanner scanner;
    private PlayerCharacter player;  // Instance du joueur
    private Game game;  // Instance du jeu

    // Constructeur
    public Menu() {
        this.scanner = new Scanner(System.in);  // Initialisation du scanner
//        this.player = setPlayer(player);  // Le joueur est passé comme argument
        this.game = new Game();  // Instancier le jeu
    }

    public void setPlayer(PlayerCharacter player) {
        this.player = player;
    }

    // Méthode d'attente entre chaque commande du joueur
    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    // Méthode pour obtenir le nom du joueur
    public String getUserNameOfThePlayer() {
        System.out.println("You wake up from a hit to the head, and hear a faint voice:\n"
                + "Hello, wanderer, what is your name...");
        String userName = scanner.nextLine();
        wait(400);
        System.out.println("Ok, so your name is " + userName + "!");
        return userName; // Retourner le nom pour le passer au PlayerCharacter
    }

    // Méthode pour obtenir le type du joueur
    public String getTypeOfThePlayer() {
        String playerType = "";

        while (true) {  // Boucle infinie jusqu'à une entrée valide
            System.out.println("Choose your class, hero...\n"
                    + "1) Choose 1 for WARRIOR \n"
                    + "2) Choose 2 for MAGICIAN \n");

            int choice = scanner.nextInt();

            if (choice == 1) {
                wait(400);
                System.out.println("You chose WARRIOR\n"
                        + "You are a warrior then, armed to the teeth. Great!");
                playerType = "Warrior"; // Type du joueur
                break;
            } else if (choice == 2) {
                wait(400);
                System.out.println("You chose MAGICIAN\n"
                        + "An expert in arcane magics, magnificent!");
                playerType = "Magician"; // Type du joueur
                break;
            } else {
                System.out.println("This class does not exist, try again...");
            }
        }

        return playerType; // Retourner le type pour le passer au PlayerCharacter
    }

    // Méthode pour afficher le menu de jeu
    public void gameMenu() {
        while (true) {
            System.out.println("Now, what would you like to do?\n"
                    + "1) Roll the dice\n"
                    + "2) Inspect my character\n"
                    + "3) Exit Game\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    wait(400);
                    System.out.println("Starting the game...");

                    // Appel du lancer de dé
                    int diceRoll = game.rollDie();
                    System.out.println("You rolled a " + diceRoll + "!");
                    break;

                case 2:
                    wait(400);
                    System.out.println("Inspecting your character:");
                    System.out.println(player.toString());  // Affiche les détails du personnage
                    break;

                case 3:
                    wait(400);
                    System.out.println("Your soul evaporates into the nether... Until we meet again!");
                    return;  // Sortir de la boucle et de la méthode

                default:
                    wait(400);
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
