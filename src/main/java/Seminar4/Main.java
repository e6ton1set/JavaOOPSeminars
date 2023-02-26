package Seminar4;

public class Main {
    public static void main(String[] args) {
        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman("Joe", 55, new Melee("Spear", 15), new WoodenShield(100)));
        squadF.add(new Footman("Moe", 100, new Melee("Sword", 44), new IronShield(200)));
        squadF.add(new Footman("doe", 20, new Melee("Incinerator", 25), new WoodenShield(100)));


        for (Footman item : squadF) {
            System.out.println(item);

        }
        System.out.println("Total health squadF: " + squadF.getTeamHealth());
        System.out.println("Range of destruction squadF: " + squadF.getMaxRange());
        System.out.println("Total damage squadF: " + squadF.getSumDamage());
        System.out.println("Min defend squadF: " + squadF.getMinDefend());
        System.out.println("________________________________________________________________________________________________________________________________");

        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Footman("Jack", 54, new Melee("Bow", 50), new IronShield(250)));
        squadA.add(new Footman("Jonathan", 54, new Melee("Crossbow", 120), new IronShield(250)));
        squadA.add(new Archer("Carl", 54, new Ranged("Axe", 90, 22), new WoodenShield(120)));

        for (BaseHero item : squadA) {
            System.out.println(item);
        }
        System.out.println("Total health squadA: " + squadA.getTeamHealth());
        System.out.println("Range of destruction squadA: " + squadA.getMaxRange());
        System.out.println("Total damage squadA: " + squadA.getSumDamage());
        System.out.println("Min defend squadA: " + squadA.getMinDefend());
        System.out.println("________________________________________________________________________________________________________________________________");

        Footman footman1 = new Footman("Mark", 77, new Melee("Book", 30), new WoodenShield(150));
        Footman footman2 = new Footman("Arch", 66, new Melee("Pin", 20), new IronShield(300));

        while (footman1.getHealth() > 0  && footman2.getHealth() > 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("================================================================================================================================");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("================================================================================================================================");
        }

        if (footman1.getHealth()>0){
            System.out.println("WIN \n" + footman1);
        } else {
            System.out.println("WIN \n" + footman2);
        }
    }


}
