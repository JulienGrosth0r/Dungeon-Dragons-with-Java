package gear.potions;

import gear.Interactable;

public abstract class Potion implements Interactable {
    private String potionName;
    private int heal;

    public Potion(String potionName, int heal) {
        this.potionName = potionName;
        this.heal = heal;
    }

    public String getPotionName() {
        return potionName;
    }
    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }

    public String toString() {
        return    "-------------------------" + "\n"
                + "POTION : \n"
                + "Potion type: " + potionName + "\n"
                + "Heal: " + "+" + heal + "HP" + "\n"
                + "-------------------------";
    }
}
