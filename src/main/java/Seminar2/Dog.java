package Seminar2;

public class Dog extends Predator implements Runable{

    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog. " + super.toString() + " My speed run is"  + speedOfRun();
    }

    public String say(){
        return "Woof-woof!";
    }

    @Override
    public int speedOfRun() {
        return 40;
    }
}
