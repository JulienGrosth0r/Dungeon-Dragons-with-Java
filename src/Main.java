import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Créer un personnage par défaut
        PlayerCharacter player = new PlayerCharacter();

        // Créer une instance du menu en passant le joueur
        Menu menu = new Menu();

        // Obtenir le nom et le type de personnage depuis le menu
        String playerName = menu.getUserNameOfThePlayer();
        String playerType = menu.getTypeOfThePlayer();
        player = new PlayerCharacter(playerName, playerType);
        menu.setPlayer(player);

        // Mettre à jour le PlayerCharacter avec le nom et le type
        player.setName(playerName);
        player.setType(playerType);

        // Démarrer le menu du jeu
        menu.gameMenu();

        // Instancier la classe Game pour le lancer de dé
        Game game = new Game();
        game.rollDie();  // Simuler le lancer de dé
    }

    public static class DefensiveGear {
        private String item;
        private int defenceLevel;
        private String name;

        public DefensiveGear(String item) {

            if (Objects.equals(item, "Protection")) {
                name = "Iron Shield";
                defenceLevel = 5;
            } else if (Objects.equals(item, "ProtectiveSpell")) {
                name = "Magic Bubble";
                defenceLevel = 7;
            }
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getItem() {
            return item;
        }
        public void setItem(String item) {
            this.item = item;
        }

        public int getDefenceLevel() {
            return defenceLevel;
        }
        public void setAttackLevel(int attackLevel) {
            this.defenceLevel = attackLevel;
        }

        public String toString() {
            return "DEFENCE : \n"
                    + "Name: " + name + "\n"
                    + "Defence Level: " + defenceLevel + "\n";
        }
    }

    public static class OffensiveGear {
        private String item;
        private int attackLevel;
        private String name;

        public OffensiveGear(String item) {

            if (Objects.equals(item, "Weapon")) {
                name = "Iron Sword";
                attackLevel = 5;
            } else if (Objects.equals(item, "Spell")) {
                name = "Fire Ball";
                attackLevel = 7;
            }
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getItem() {
            return item;
        }
        public void setItem(String item) {
            this.item = item;
        }

        public int getAttackLevel() {
            return attackLevel;
        }
        public void setAttackLevel(int attackLevel) {
            this.attackLevel = attackLevel;
        }

        public String toString() {
            return "OFFENCE : \n"
                    + "Name: " + name + "\n"
                    + "Attack Level: " + attackLevel + "\n";
        }
    }
}
