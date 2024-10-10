package gear;

public abstract class DefensiveGear implements Interactable {
    private String item;
    private int defenceLevel;
    private String name;

    public DefensiveGear(String name, int defenceLevel) {
        this.name = name;
        this.defenceLevel = defenceLevel;
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
