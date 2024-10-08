package Gear;

public class Spell extends OffensiveGear {

    public Spell() {
        super("Spell");  // Appelle le constructeur de OffensiveGear avec "Spell"
        this.setName("Fire Ball");
        this.setAttackLevel(7);
    }
}
