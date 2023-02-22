package Seminar2;

public class Swan extends Herbivores implements Swimable, Sayable, Runable, Flyable{

    public Swan(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfRun() {
        return 22;
    }

    public String say(){
        return "Says the swan!";
    }
    @Override
    public int speedOfFly() {
        return 5;
    }

    public Double speedOfSwim(){
        return 50.5;
    }

    @Override
    public String toString(){
        return "I'm swan. " + super.toString() + " My speed run is " + speedOfRun() + " My speed fly is " + speedOfFly() + " My speed swim is " + speedOfSwim();
    }
}

