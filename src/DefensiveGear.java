import java.util.Objects;

public class DefensiveGear {
    private String item;
    private int defenceLevel;
    private String name;

    public DefensiveGear(String item) {

        if (Objects.equals(item, "Protection")) {
            name = "Iron Shield";
            defenceLevel = 5;
        } else if (Objects.equals(item, "protectiveSpell")) {
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