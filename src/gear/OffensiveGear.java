package gear;

public abstract class OffensiveGear implements Interactable {
    private String item;
    private int attackLevel;
    private String name;
    protected String matchableOffensiveType;

    public OffensiveGear(String name, int attackLevel, String matchableOffensiveType) {
        this.name = name;
        this.attackLevel = attackLevel;
        this.matchableOffensiveType = matchableOffensiveType;
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
        return "-------------------------" + "\n"
                + "OFFENCE : \n" +
                "Name: " + this.name + "\n" +
                "Attack Level: " + "+" + this.attackLevel + " to your Attack Points" + "\n"
                + "-------------------------";
    }
}