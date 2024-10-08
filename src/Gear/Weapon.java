package Gear;

public class Weapon extends OffensiveGear {

    public Weapon() {
        super("Weapon");  // Appelle le constructeur de OffensiveGear avec "Weapon"
        this.setName("Iron Sword");
        this.setAttackLevel(5);
    }
}
