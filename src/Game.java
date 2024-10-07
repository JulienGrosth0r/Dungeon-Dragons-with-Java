public class Game {

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
}