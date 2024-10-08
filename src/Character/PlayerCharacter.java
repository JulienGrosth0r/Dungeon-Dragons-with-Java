package Character;

import Gear.DefensiveGear;
import Gear.OffensiveGear;

import java.util.Objects;

public abstract class PlayerCharacter {
    private String name;
    private String type;
    private int HP;
    private int AP;
    protected OffensiveGear offensiveGear;
    protected DefensiveGear defensiveGear;


    public PlayerCharacter() {
        this("Anonymous Player");
    }

    public PlayerCharacter(String name) {
        this(name, "Warrior");
    }

    public PlayerCharacter(String name, String type) {
        this.name = name;
        this.type = type;
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

    public void setAP(int AP) {
        this.AP = AP;
    }


    public String toString() {
        return "PLAYER CHARACTER : \n"
                + "Name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Hit Points: " + HP + "\n"
                + "Attack Points: " + AP
                + "\n\n" + offensiveGear.toString() + "\n"
                + defensiveGear.toString() + "\n";
    }
}
