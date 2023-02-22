package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animals> animals = new ArrayList<>();

    public List<Animals> addAnimals(List<Animals> animals){
        this.animals.addAll(animals);
        return this.animals;
    }
    public List<Animals> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable(){
        List<Sayable> resultSayable = new ArrayList<>();
        for (Animals item : animals) {
            resultSayable.add(item);
        }
        resultSayable.add(radio);
        return resultSayable;
    }

    public List<Runable> getRunable() {
        List<Runable> resultRunable = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Runable) {
                resultRunable.add((Runable) item);
            }
        }
        return resultRunable;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> resultFlyable = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Flyable) {
                resultFlyable.add((Flyable) item);
            }
        }
        return resultFlyable;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> resultSwimable = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Swimable) {
                resultSwimable.add((Swimable) item);
            }
        }
        return resultSwimable;
    }

    public Runable getChampionRun(){
        List<Runable> speedRunAnimals = getRunable();
        Runable championRun = speedRunAnimals.get(0);
        for (Runable item: speedRunAnimals) {
            if (championRun.speedOfRun() < item.speedOfRun()){
                 championRun = item;
            }
        }
        return championRun;
    }

    public Flyable getChampionFly(){
        List<Flyable> speedFlyAnimals = getFlyable();
        Flyable championFly = speedFlyAnimals.get(0);
        for (Flyable item: speedFlyAnimals) {
            if (championFly.speedOfFly() < item.speedOfFly()){
                championFly = item;
            }
        }
        return championFly;
    }

    public Swimable getChampionSwim(){
        List<Swimable> speedSwimAnimals = getSwimable();
        Swimable championSwim = speedSwimAnimals.get(0);
        for (Swimable item: speedSwimAnimals) {
            if (championSwim.speedOfSwim() < item.speedOfSwim()){
                championSwim = item;
            }
        }
        return championSwim;
    }
}
