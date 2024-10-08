package Gear;

import java.util.Objects;

public class DefensiveGear {
    private String item;
    private int defenceLevel;
    private String name;

    public DefensiveGear(String item) {
        if (Objects.equals(item, "Protection")) {
            this.name = "Iron Shield";
            this.defenceLevel = 5;
        } else if (Objects.equals(item, "ProtectiveSpell")) {
            this.name = "Magic Bubble";
            this.defenceLevel = 7;
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDefenceLevel() {
        return this.defenceLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.defenceLevel = attackLevel;
    }

    public String toString() {
        return "DEFENCE : \nName: " + this.name + "\nDefence Level: " + this.defenceLevel + "\n";
    }
}
