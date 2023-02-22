package Seminar2;

public abstract class Predator extends Animals{
    public Predator (String nickname){
        super(nickname);
    }

    public String feed(){
        return "Meat";
    }
}
