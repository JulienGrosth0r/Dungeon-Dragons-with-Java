import java.util.Scanner;

import character.PlayerCharacter;

public class Menu {
    private Scanner scanner;
    private PlayerCharacter player;  // Instance du joueur

    // Constructeur
    public Menu() {
        this.scanner = new Scanner(System.in);  // Initialisation du scanner
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
        return userName;
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
                wait(300);
                System.out.println("You chose WARRIOR\n"
                        + "You are a warrior then, armed to the teeth. Great!");
                playerType = "Warrior"; // Type du joueur
                break;
            } else if (choice == 2) {
                wait(300);
                System.out.println("You chose MAGICIAN\n"
                        + "An expert in arcane magics, magnificent!");
                playerType = "Magician"; // Type du joueur
                break;
            } else {
                System.out.println("This class does not exist, try again...");
            }
        }

        return playerType; // Retourner le type pour le passer au Character.PlayerCharacter
    }

    // Méthode pour afficher le menu de jeu
    public int gameMenu() {
        while (true) {
            System.out.println("Now, what would you like to do?\n"
                    + "1) Roll the dice\n"
                    + "2) Inspect my character\n"
                    + "3) Exit Game\n");

            return scanner.nextInt();
        }
    }

    // Méthode pour proposer de rejouer ou quitter
    public int offerReplay() {

        System.out.println("Would you like to:\n"
                + "1) Play again\n"
                + "2) Exit game\n");

        return scanner.nextInt();
    }

    public void victoryText() {
        System.out.println("Winner winner chicken dinner! You have defeated the dungeon!");
    }
}

