package Seminar4;

public class Archer extends BaseHero<Ranged>{

    public Archer(String name, int health, Ranged ranged) {
        super(name, health, ranged);
    }

    public int range(){
       return  weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                '}';
    }
}
