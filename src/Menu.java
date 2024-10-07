import java.util.Scanner;

public class Menu {
    // Attributs privés
    private Scanner scanner;
    private PlayerCharacter player;  // Instance du joueur
    private Game game;  // Instance du jeu

    // Constructeur
    public Menu() {
        this.scanner = new Scanner(System.in);  // Initialisation du scanner
        this.game = new Game();  // Instancier le jeu
    }

    public void setPlayer(PlayerCharacter player) {
        this.player = player;  // Assigner le joueur à l'instance de Menu
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
                    System.out.println("Rolling the dice...");

                    // Appel de la méthode movePlayer qui inclut le lancer de dé et la mise à jour de la position
                    game.movePlayer(); // Appelle la méthode pour faire avancer le joueur

                    // Vérifier si le joueur a gagné
                    if (game.getPlayerPosition() >= 64) {
                        offerReplay(); // Appel de la méthode pour offrir la possibilité de rejouer
                    }
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

    // Méthode pour proposer de rejouer ou quitter
    private void offerReplay() {
        while (true) {
            System.out.println("Would you like to:\n"
                    + "1) Play again\n"
                    + "2) Exit game\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game = new Game();  // Réinitialiser le jeu
                    return;  // Retourner au menu principal

                case 2:
                    System.out.println("Your soul evaporates into the nether... Until we meet again!");
                    System.exit(0);  // Quitter le programme

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}