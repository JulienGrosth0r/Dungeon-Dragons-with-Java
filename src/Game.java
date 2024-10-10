import enemies.Dragon;
import enemies.Enemy;
import enemies.Goblin;
import enemies.Sorcerer;
import gear.DefensiveGear;
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

import java.util.ArrayList;

public class Game {
    private int playerPosition;  // Position actuelle du joueur
    private ArrayList board;

    // Constructeur pour initialiser la position du joueur
    public Game() {
        this.playerPosition = 1;  // Commencer sur la case 1
        this.board = new ArrayList<>();
    }

//    // Initialisation du plateau de jeu
//    private void initBoard(ArrayList board) {
//
//    }

    private void fillBoard(ArrayList board) {
        board.add(new LightningBolt());  // Case 1
        board.add(new Mace());           // Case 2
        board.add(new Goblin());         // Case 3
        board.add(new LightningBolt());  // Case 4
        board.add(new Mace());           // Case 5
        board.add(new Goblin());         // Case 6
        board.add(new SmallPotion());    // Case 7
        board.add(new LightningBolt());  // Case 8
        board.add(new Goblin());         // Case 9
        board.add(new Sorcerer());       // Case 10
        board.add(new Mace());           // Case 11
        board.add(new Goblin());         // Case 12
        board.add(new SmallPotion());    // Case 13
        board.add(new CaseVide());       // Case 14
        board.add(new Goblin());         // Case 15
        board.add(new CaseVide());       // Case 16
        board.add(new LightningBolt());  // Case 17
        board.add(new Goblin());         // Case 18
        board.add(new IronSword());      // Case 19
        board.add(new Sorcerer());       // Case 20
        board.add(new Goblin());         // Case 21
        board.add(new Mace());           // Case 22
        board.add(new LightningBolt());  // Case 23
        board.add(new Goblin());         // Case 24
        board.add(new Sorcerer());       // Case 25
        board.add(new IronSword());      // Case 26
        board.add(new Goblin());         // Case 27
        board.add(new LargePotion());    // Case 28
        board.add(new CaseVide());       // Case 29
        board.add(new Goblin());         // Case 30
        board.add(new SmallPotion());    // Case 31
        board.add(new Sorcerer());       // Case 32
        board.add(new SmallPotion());    // Case 33
        board.add(new CaseVide());       // Case 34
        board.add(new Sorcerer());       // Case 35
        board.add(new Sorcerer());       // Case 36
        board.add(new Sorcerer());       // Case 37
        board.add(new Mace());           // Case 38
        board.add(new SmallPotion());    // Case 39
        board.add(new Sorcerer());       // Case 40
        board.add(new LargePotion());    // Case 41
        board.add(new IronSword());      // Case 42
        board.add(new SmallPotion());    // Case 43
        board.add(new Sorcerer());       // Case 44
        board.add(new Dragon());         // Case 45
        board.add(new CaseVide());       // Case 46
        board.add(new Sorcerer());       // Case 47
        board.add(new FireBall());       // Case 48
        board.add(new FireBall());       // Case 49
        board.add(new CaseVide());       // Case 50
        board.add(new CaseVide());       // Case 51
        board.add(new Dragon());         // Case 52
        board.add(new IronSword());      // Case 53
        board.add(new CaseVide());       // Case 54
        board.add(new CaseVide());       // Case 55
        board.add(new Dragon());         // Case 56
        board.add(new CaseVide());       // Case 57
        board.add(new CaseVide());       // Case 58
        board.add(new CaseVide());       // Case 59
        board.add(new CaseVide());       // Case 60
        board.add(new CaseVide());       // Case 61
        board.add(new Dragon());         // Case 62
        board.add(new CaseVide());       // Case 63
        board.add(new CaseVide());       // Case 64

    }

    // Méthode pour obtenir un nombre aléatoire entre min et max, inclus
    private int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Méthode pour simuler le lancer de dé
    public int rollDie() {
        int diceRoll = getRandom(1, 6);  // Lancer un dé à 6 faces
        System.out.println("Hero's dice roll: " + diceRoll);
        return diceRoll;
    }

    // Méthode pour faire avancer le joueur
    public void movePlayer() {
        int diceRoll = rollDie();  // Lancer le dé
        playerPosition += diceRoll;  // Avancer le joueur

        // Vérifier si le joueur a atteint ou dépassé la case 64
        if (playerPosition >= 64) {
            playerPosition = 64;  // Limiter à 64
            System.out.println("Congratulations! You've reached the end of the game at position " + playerPosition + "!");
        } else {
            System.out.println("Player is now at position: " + playerPosition + "/64");
        }
    }

    // Getter pour obtenir la position actuelle du joueur
    public int getPlayerPosition() {
        return playerPosition;
    }
}
