package Seminar2;

public class Butterfly extends Herbivores implements Flyable {

    public Butterfly(String nickname) {
        super(nickname);
    }
    @Override
    public String toString(){
        return "I'm butterfly. " + super.toString() + " My speed fly is " + speedOfFly();
    }
    public String say(){
        return "=_=!";
    }
    @Override
    public int speedOfFly() {
        return 30;
    }
}