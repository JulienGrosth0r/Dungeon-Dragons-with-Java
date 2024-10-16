package character;

import gear.DefensiveGear;
import gear.OffensiveGear;
import gear.potions.Potion;

public abstract class PlayerCharacter {
    private String name;
    private String type;
    private int HP;
    private final int AP;
    protected OffensiveGear offensiveGear;
    protected DefensiveGear defensiveGear;
    protected Potion potion;


    public PlayerCharacter() {
        this("Anonymous Player");
    }

    public PlayerCharacter(String name) {
        this(name, "Warrior", 10);
    }

    public PlayerCharacter(String name, String type, int ap) {
        this.name = name;
        this.type = type;
        this.AP = ap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAP() {
        return AP;
    }

    public OffensiveGear getOffensiveGear() {
        return offensiveGear;
    }

    public void setOffensiveGear(OffensiveGear offensiveGear) {
        this.offensiveGear = offensiveGear;
    }

    public DefensiveGear getDefensiveGear() {
        return defensiveGear;
    }

    public void setDefensiveGear(DefensiveGear defensiveGear) {
        this.defensiveGear = defensiveGear;
    }

    public String toString() {
        return "PLAYER CHARACTER : \n"
                + "Name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Hit Points: " + HP + " + " + defensiveGear.getDefenceLevel() + "\n"
                + "Attack Points: " + AP + " + " + offensiveGear.getAttackLevel()
                + "\n\n" + offensiveGear.toString() + "\n"
                + defensiveGear.toString() + "\n";
    }
}
