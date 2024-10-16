import java.util.Scanner;

import character.PlayerCharacter;
import enemies.Enemy;
import gear.DefensiveGear;
import gear.OffensiveGear;
import gear.potions.Potion;

public class Menu {
    private Scanner scanner;

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
                    + "2) Choose 2 for MAGICIAN \n"
                    + "3) Choose 3 for BARD \n");

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
            } else if (choice == 3) {
                wait(300);
                System.out.println("You chose BARD\n"
                        + "Quite the useless fellow in a dungeon...");
                playerType = "Bard";
                break;
            } else {
                System.out.println("This class does not exist, try again...");
            }
        }

        return playerType;
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

    public void enemyInteractions(Enemy enemy, PlayerCharacter playerCharacter) {
        System.out.println("The " + enemy.getEnemyName() + " hits you for " + enemy.getEnemyAP() + "!");
        System.out.println("You currently have " + playerCharacter.getHP() + " HP left.");
        System.out.println("-------------------------");
        System.out.println("You hit the " + enemy.getEnemyName() + " for " + (playerCharacter.getAP() + playerCharacter.getOffensiveGear().getAttackLevel()) + "!");
        System.out.println("The " + enemy.getEnemyName() + " has " + enemy.getEnemyHP() + " HP left." );
        System.out.println("-------------------------");
    }

    public void potionInteractions(Potion potion, PlayerCharacter playerCharacter) {
        System.out.println("The " + potion.getPotionName() + " heals you for " + potion.getHeal() + "!");
        System.out.println("Your HP is now of " + playerCharacter.getHP() + ".");
        System.out.println("-------------------------");
    }

    public void offenseInteractions(OffensiveGear offensiveGear, PlayerCharacter playerCharacter) {
//        System.out.println("The " + offensiveGear.getName() + " increases your AP of " + offensiveGear.getAttackLevel() + "!");
//        System.out.println("Your AP are now of " + playerCharacter.getAP() + " + " + offensiveGear.getAttackLevel() + ".");
        System.out.println("-------------------------");
    }

    public void defenseInteractions(DefensiveGear defensiveGear, PlayerCharacter playerCharacter) {
//        System.out.println("The " + defensiveGear.getName() + " increases your HP of " + defensiveGear.getDefenceLevel() + "!");
//        System.out.println("Your HP are now of " + playerCharacter.getHP() + " + " + defensiveGear.getDefenceLevel() + ".");
        System.out.println("-------------------------");
    }

    // Méthode pour proposer de rejouer ou quitter
    public int offerReplay() {

        System.out.println("Would you like to:\n"
                + "1) Play again\n"
                + "2) Exit game\n");

        return scanner.nextInt();
    }

    public void victoryText() {
        System.out.println(
                "************************************************************ \n"
                        + "Winner winner chicken dinner! You have defeated the dungeon! \n"
                        + "************************************************************");
    }
}

