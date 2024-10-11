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

public class Game {
    private int playerPosition;  // Position actuelle du joueur
    private ArrayList<Interactable> board;
    PlayerCharacter player;
    Menu menu;

    // Constructeur pour initialiser la position du joueur
    public Game() {
        this.playerPosition = 0;  // Commencer sur la case 0
        this.menu = new Menu();
        this.board = new ArrayList<>();
        runGame();
    }

    public void runGame() {
        fillBoard(board);
        Collections.shuffle(board);
        createCharacter(menu.getUserNameOfThePlayer(), menu.getTypeOfThePlayer());
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

    private void fillBoard(ArrayList board) {

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

        //Weapons
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
    }

    private void createCharacter(String name, String type) {

        switch (type) {
            case "Warrior":
                player = new Warrior(name);
                break;
            case "Magician":
                player = new Magician(name);
                break;
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
                System.out.println("Your soul evaporates into the nether... Until we meet again!");
                System.exit(0);
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
                runGame();  // Réinitialiser le jeu

            case 2:
                System.out.println("Your soul evaporates into the nether... Until we meet again!");
                System.exit(0);  // Quitter le programme

            default:
                System.out.println("Invalid choice, please try again.");
                endGameChoices(menu.offerReplay());
        }
    }

    private int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public int rollDie() {
        int diceRoll = getRandom(1, 6);  // Lancer un dé à 6 faces
        System.out.println("Hero's dice roll: " + diceRoll);
        return diceRoll;
    }

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
    }
}