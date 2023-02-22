package Seminar2;

public class Duck extends Herbivores implements Flyable, Runable, Swimable {

    public Duck(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfRun() {
        return 10;
    }
    @Override
    public String toString(){
        return "I'm duck. " + super.toString() + " My speed run is " + speedOfRun() + " My speed fly is " + speedOfFly() + " My speed swim is " + speedOfSwim();
    }
    public String say(){
        return "Quack-quack!";
    }
    @Override
    public int speedOfFly() {
        return 80;
    }

    public Double speedOfSwim(){
        return 45.2;
    }
}
