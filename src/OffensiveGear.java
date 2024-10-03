import java.util.Objects;

public class OffensiveGear {
    private String item;
    private int attackLevel;
    private String name;

    public OffensiveGear(String item, String name, int attackLevel) {
        this.item = item;
        this.name = name;
        this.attackLevel = attackLevel;

        if(Objects.equals(item, "Warrior")){
            this.item = "Weapon";
            this.name = "Sword";
            this.attackLevel = 15;
        } else if(Objects.equals(item, "Magician")){
            this.item = "Spell";
            this.name = "Fire Ball";
            this.attackLevel = 22;
        }
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
                + "Type: " + item + "\n"
                + "Attack Level: " + attackLevel + "\n";
    }
}