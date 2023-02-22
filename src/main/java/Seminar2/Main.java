package Seminar2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(List.of(new Cat("Murky"), new Dog("Rich"),
                new Rabbit("Bags Bani"), new Cow("Burenka"), new Duck("Quack"), new Butterfly("Butterfly"), new Swan("Black swan")));

        System.out.println("Говорящий зоопарк:");
        for (Sayable animal : zoo.getSayable()){
            System.out.println(animal.say());
        }
        System.out.println("_________________________________________________________________________________________\nБегающие животные: ");
        for (Runable run : zoo.getRunable()){
            System.out.println(run);
        }

        System.out.println("_________________________________________________________________________________________\nЛетающие животные: ");
        for (Flyable fly : zoo.getFlyable()){
            System.out.println(fly);
        }

        System.out.println("_________________________________________________________________________________________\nПлавающие животные: ");
        for (Swimable swim : zoo.getSwimable()){
            System.out.println(swim);
        }
        System.out.println("_________________________________________________________________________________________\nЧемпион по бегу:");
        System.out.println(zoo.getChampionRun());
        System.out.println("_________________________________________________________________________________________\nЧемпион по полёту: ");
        System.out.println(zoo.getChampionFly());
        System.out.println("_________________________________________________________________________________________\nЧемпион по плаванью:");
        System.out.println(zoo.getChampionSwim());
    }
}
