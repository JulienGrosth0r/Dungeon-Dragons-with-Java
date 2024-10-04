import java.util.Scanner;

public class Menu {

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static String getUserNameOfThePlayer() {
        Scanner userInputName = new Scanner(System.in);
        System.out.println("You wake up from a hit to the head, and hear a faint voice:\n"
                + "Hello, wanderer, what is your name...");
        String userName = userInputName.nextLine();
        wait(300);
        System.out.println("Ok, so your name is " + userName + "!");
        return userName; // Retourner le nom pour le passer au PlayerCharacter
    }

    public static String getTypeOfThePlayer() {
        Scanner userInputType = new Scanner(System.in);
        String playerType = "";

        while (true) {  // Boucle infinie jusqu'à une entrée valide
            System.out.println("Choose your class, hero...\n"
                    + "1) Choose 1 for WARRIOR \n"
                    + "2) Choose 2 for MAGICIAN \n");

            int choice = userInputType.nextInt();

            if (choice == 1) {
                wait(300);
                System.out.println("You chose WARRIOR\n"
                        + "You are a warrior then, armed to the teeth. Great!");
                playerType = "Warrior"; // Type du joueur
                break;  // Sortir de la boucle quand le choix est valide
            } else if (choice == 2) {
                wait(300);
                System.out.println("You chose MAGICIAN\n"
                        + "An expert in arcane magics, magnificent!");
                playerType = "Magician"; // Type du joueur
                break;  // Sortir de la boucle quand le choix est valide
            } else {
                System.out.println("This class does not exist, try again...");
            }
        }

        return playerType; // Retourner le type pour le passer au PlayerCharacter
    }

    public static String gameMenu(PlayerCharacter player, PlayerCharacter playerCharacter) {
        Scanner userInputMenu = new Scanner(System.in);

        while (true) {
            System.out.println("Now, what would you like to do?\n"
                    + "1) Start playing\n"
                    + "2) Inspect my character\n"
                    + "3) Modify my character\n"
                    + "4) Exit Game\n");

            int choice = userInputMenu.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting the game... (not implemented yet)");
                    break;

                case 2:
                    System.out.println("Inspecting your character:");
                    System.out.println(player.toString());  // Affiche les détails du personnage
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Exiting the game. Goodbye!");
                    return "";

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
