package Seminar4;

public class Footman extends BaseHero<Melee>{

    public Footman(String name, int health, Melee weapon) {
        super(name, health, weapon);
    }

    @Override
    public String toString() {
        return "Footman{" +
                '}' + super.toString();
    }
}
