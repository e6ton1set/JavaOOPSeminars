package Seminar2;

public abstract class Herbivores extends Animals {

    public Herbivores(String nickname) {
        super(nickname);
    }

    public String feed(){
        return "Grass";
    }
}
