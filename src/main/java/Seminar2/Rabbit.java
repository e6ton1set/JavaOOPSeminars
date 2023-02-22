package Seminar2;

public class Rabbit extends Herbivores implements Runable{

    public Rabbit(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm rabbit. " + super.toString() + " My speed run is " + speedOfRun();
    }

    public String say(){
        return "Grr!";
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}