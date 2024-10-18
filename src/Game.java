import character.Magician;
import character.PlayerCharacter;
import character.Warrior;
import enemies.Dragon;
import enemies.Enemy;
import enemies.Goblin;
import enemies.Sorcerer;
import gear.DefensiveGear;
import gear.Interactable;
import gear.magicianGear.FireBall;
import gear.magicianGear.LightningBolt;
import gear.OffensiveGear;
import gear.magicianGear.MagicBubble;
import gear.potions.LargePotion;
import gear.potions.Potion;
import gear.potions.SmallPotion;
import gear.warriorGear.IronShield;
import gear.warriorGear.IronSword;
import gear.warriorGear.Mace;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import exceptions.InvalidCharacterTypeException;

/**
 * The main class that manages the game logic.
 */
public class Game {
    private int playerPosition;
    private final ArrayList<Interactable> board;
    private PlayerCharacter player;
    private final Menu menu;


    /**
     * Constructor that initializes the player's starting position and sets up the game board.
     */
    public Game() {
        this.playerPosition = 0;  // Commencer sur la case 0
        this.menu = new Menu();
        this.board = new ArrayList<>();
    }

    /**
     * Runs the game loop. The player rolls the dice, moves, and interacts with the board
     * until they reach position 64. After reaching position 64, the victory text is displayed,
     * and the player can choose to replay or quit.
     */
    public void runGame() {
        fillBoard();
        Collections.shuffle(board);
        String playerName = menu.getUserNameOfThePlayer();
        String playerType = menu.getTypeOfThePlayer();
        try {
            createCharacter(playerName, playerType);
        } catch (InvalidCharacterTypeException e) {
            // Afficher le message d'erreur
            System.out.println(e.getMessage());
            Main.main(null);
        }

        while (playerPosition != 64) {
            int choice = menu.gameMenu();
            executeChoiceMenu(choice);
            movePlayer();
            if (playerPosition < 64) {
                interactWithCase(playerPosition, player);  // Interagir avec la case uniquement si le joueur n'a pas encore atteint 64
            }
            wait(400);
        }
        menu.victoryText();
        endGameChoices(menu.offerReplay());
    }

    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void fillBoard() {

        // Spells
        int lightningBoltQty = 5;
        int fireballQty = 2;
        int magicBubbleQty = 3;

        for (int i = 0; i < lightningBoltQty; i++) {
            board.add(new LightningBolt());
        }
        for (int i = 0; i < fireballQty; i++) {
            board.add(new FireBall());
        }
        for (int i = 0; i < magicBubbleQty; i++) {
            board.add(new MagicBubble());
        }

        //Weapons & Shield
        int maceQty = 5;
        int swordQty = 5;
        int shieldQty = 3;

        for (int i = 0; i < maceQty; i++) {
            board.add(new Mace());
        }
        for (int i = 0; i < swordQty; i++) {
            board.add(new IronSword());
        }
        for (int i = 0; i < shieldQty; i++) {
            board.add(new IronShield());
        }

        //Potions
        int smallPotionQty = 6;
        int largePotionQty = 2;

        for (int i = 0; i < smallPotionQty; i++) {
            board.add(new SmallPotion());
        }
        for (int i = 0; i < largePotionQty; i++) {
            board.add(new LargePotion());
        }

        //Enemies
        int goblinQty = 10;
        int sorcererQty = 10;
        int dragonQty = 4;

        for (int i = 0; i < goblinQty; i++) {
            board.add(new Goblin());
        }
        for (int i = 0; i < sorcererQty; i++) {
            board.add(new Sorcerer());
        }
        for (int i = 0; i < dragonQty; i++) {
            board.add(new Dragon());
        }

        // Empty rooms
        int caseVide = 9;

        for (int i = 0; i < caseVide; i++) {
            board.add(new CaseVide());
        }
    }

    private void createCharacter(String name, String type) throws InvalidCharacterTypeException {

        switch (type) {
            case "Warrior":
                player = new Warrior(name);
                break;
            case "Magician":
                player = new Magician(name);
                break;
            default:
                throw new InvalidCharacterTypeException(
                        "************************************************************ \n"
                                + "ERRORERRORERROR This is an invalid character type: " + type + " ERRORERRORERROR \n"
                                + "************************************************************ \n"
                                + "...");
        }
    }

    private void executeChoiceMenu(int choice) {
        switch (choice) {
            case 1:
                wait(300);
                System.out.println("Rolling the dice...");
                break;

            case 2:
                wait(300);
                System.out.println("Inspecting your character:");
                System.out.println(player.toString());  // Affiche les détails du personnage
                choice = menu.gameMenu();
                break;

            case 3:
                wait(300);
                System.out.println("Your soul evaporates into the nether... Until we meet again, hero!");
                endGameChoices(menu.offerReplay());
                break;

            default:
                wait(300);
                System.out.println("Invalid choice, please try again.");
                menu.gameMenu();
                executeChoiceMenu(menu.gameMenu());
        }
    }

    private void endGameChoices(int choice) {

        switch (choice) {
            case 1:
                Main.main(null);  // Réinitialiser le jeu
                break;
            case 2:
                System.out.println("See you next time!");
                System.exit(0);  // Quitter le programme
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                endGameChoices(menu.offerReplay());
        }
    }

    private int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Rolls a die and returns a random number between 1 and 6.
     *
     * @return the result of the dice roll, a number between 1 and 6.
     */
    public int rollDie() {
        int diceRoll = getRandom(1, 6);  // Lancer un dé à 6 faces
        System.out.println("Hero's dice roll: " + diceRoll);
        return diceRoll;
    }

    /**
     * Moves the player based on the result of the dice roll. The player cannot move
     * beyond position 64, and a message is displayed when the player reaches the end.
     */
    public void movePlayer() {
        int diceRoll = rollDie();  // Lancer le dé
        playerPosition += diceRoll;  // Avancer le joueur

        // Vérifier si le joueur a atteint ou dépassé la case 64
        if (playerPosition >= 64) {
            playerPosition = 64;  // Limiter à 64
            System.out.println("Congratulations! You've reached the end of the game at position " + playerPosition + "!");
            System.out.println("-------------------------");
        } else {
            System.out.println("Player is now at position: " + playerPosition + "/64");
            System.out.println("-------------------------");
        }
    }

    private void interactWithCase(int playerPosition, PlayerCharacter player) {
        Interactable objet = board.get(playerPosition);
        objet.interact(player);
        if (objet instanceof Enemy) {
            Interactable enemy = board.get(playerPosition);
            menu.enemyInteractions((Enemy) enemy, player);
            isEnemyDead((Enemy) objet);
            isPlayerDead();
        } else if (objet instanceof Potion) {
            Interactable potion = board.get(playerPosition);
            menu.potionInteractions((Potion) potion, player);
        } else if (objet instanceof OffensiveGear) {
            Interactable offensiveGear = board.get(playerPosition);
            menu.offenseInteractions((OffensiveGear) offensiveGear, player);
        } else if (objet instanceof DefensiveGear) {
            Interactable defensiveGear = board.get(playerPosition);
            menu.defenseInteractions((DefensiveGear) defensiveGear, player);
        }
    }

    private void isPlayerDead() {
        int playerHP = player.getHP();
        if (playerHP <= 0) {
            System.out.println("You bleed out in a pool of blood.");
            System.out.println("-------------------------");
            endGameChoices(menu.offerReplay());
        }
    }

    private void isEnemyDead(Enemy enemy) {
        int enemyHP = enemy.getEnemyHP();
        if (enemyHP <= 0) {
            System.out.println("The " + enemy.getEnemyName() + " falls to the floor, dead.");
            System.out.println("-------------------------");
        }
    }
}