package Seminar4;

public class Melee implements Weapon{

    private String weaponName;
    private int damagePoint;

    @Override
    public int damage() {
        return damagePoint;
    }

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }
}
