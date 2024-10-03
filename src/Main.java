public class Main {
    public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("Julien","Warrior");
        System.out.println(player);

        OffensiveGear offence = new OffensiveGear("Weapon", "Sword", 15);
        System.out.println(offence);
    }
}
