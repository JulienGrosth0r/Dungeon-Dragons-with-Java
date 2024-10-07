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
        int dieRoll = getRandom(1, 6);  // Lancer un dé à 6 faces
        System.out.println("Hero's turn: " + dieRoll);
        return dieRoll;
    }

    // Méthode pour faire avancer le joueur
    public void movePlayer() {
        int dieRoll = rollDie();  // Lancer le dé
        playerPosition += dieRoll;  // Avancer le joueur

        // Vérifier si le joueur a atteint ou dépassé la case 64
        if (playerPosition >= 64) {
            playerPosition = 64;  // Limiter à 64
            System.out.println("Congratulations! You've reached the end of the game at position " + playerPosition + "!");
            // Tu peux ici ajouter une logique pour terminer le jeu, comme retourner à un menu ou afficher un message final.
        } else {
            System.out.println("Player is now at position: " + playerPosition);
        }
    }

    // Getter pour obtenir la position actuelle du joueur
    public int getPlayerPosition() {
        return playerPosition;
    }
}
