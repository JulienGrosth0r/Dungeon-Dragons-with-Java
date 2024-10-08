public class Game {
    private int playerPosition;  // Position actuelle du joueur

    // Constructeur pour initialiser la position du joueur
    public Game() {
        this.playerPosition = 1;  // Commencer sur la case 1
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
