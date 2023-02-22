package Seminar1;

/*На основе кода с урока добавить еще один класс продукта,
(Молоко, шоколад ,и т.п., можно добавить несколько классов),
они должны наследоваться от класса Product, надо переопределить метод toString и
попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine*/

public class Snack extends Product{
    private int callorage = 0;
    public Snack(String name, Double price, int callorage) {
        super(name, price);
        this.callorage = callorage;
    }

    @Override
    public String toString(){
        return String.format("%s callorage = %d" , super.toString(), callorage);
    }
}
