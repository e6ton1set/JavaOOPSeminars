package Seminar2;

public class Cow extends Herbivores implements Runable{

    public Cow(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cow. " + super.toString() + " My speed run is " + speedOfRun();
    }

    public String say(){
        return "Moo-moo!";
    }


    @Override
    public int speedOfRun() {
        return 15;
    }
}