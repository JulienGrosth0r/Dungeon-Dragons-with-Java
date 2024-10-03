import java.util.Objects;

public class PlayerCharacter {
    private String name;
    private String type;
    private int HP;
    private int AP;


    public PlayerCharacter() {
        this("Anonymous Player");
    }

    public PlayerCharacter(String name) {
        this(name, "Warrior");
    }

    public PlayerCharacter(String name, String type) {
        this.name = name;
        this.type = type;

        if(Objects.equals(type, "Warrior")){
            this.HP = 10;
            this.AP = 10;
        }
        else if(Objects.equals(type, "Magician")){
            this.HP = 6;
            this.AP = 15;
        }
    }
}