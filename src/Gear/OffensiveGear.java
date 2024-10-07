package Gear;

import java.util.Objects;

public class OffensiveGear {
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