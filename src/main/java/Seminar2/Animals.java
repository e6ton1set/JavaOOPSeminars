package Seminar2;

public abstract class Animals implements Sayable {
    public String nickname;

    public Animals(String nickname) {
        this.nickname = nickname;
    }
    public abstract String feed(); // инициализация абстрактного метода абстрактного Класса

    public String toString(){
        return "My nickname is " + nickname;
    }
}
