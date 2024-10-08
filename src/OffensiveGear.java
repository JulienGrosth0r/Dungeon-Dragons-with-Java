import java.util.Objects;

public class OffensiveGear {
    private String item;
    private int attackLevel;
    private String name;

    public OffensiveGear(String item) {
        if (Objects.equals(item, "Weapon")) {
            this.name = "Iron Sword";
            this.attackLevel = 5;
        } else if (Objects.equals(item, "Spell")) {
            this.name = "Fire Ball";
            this.attackLevel = 7;
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

    public int getAttackLevel() {
        return this.attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String toString() {
        return "OFFENCE : \nName: " + this.name + "\nAttack Level: " + this.attackLevel + "\n";
    }
}