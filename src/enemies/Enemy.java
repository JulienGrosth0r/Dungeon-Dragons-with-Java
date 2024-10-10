package enemies;

import gear.Interactable;

public abstract class Enemy implements Interactable {
    private String enemyName;
    private int enemyHP;
    private int enemyAP;

    public Enemy(String enemyName, int enemyHP, int enemyAP) {
        this.enemyName = enemyName;
        this.enemyHP = enemyHP;
        this.enemyAP = enemyAP;
    }

    public String getEnemyName(){
        return this.enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemyAP() {
        return enemyAP;
    }

    public void setEnemyAP(int enemyAP) {
        this.enemyAP = enemyAP;
    }

    public String toString() {
        return "ENEMY CHARACTER : \n"
                + "Name: " + enemyName + "\n"
                + "Hit Points: " + enemyHP + "\n"
                + "Attack Points: " + enemyAP;
    }
}
