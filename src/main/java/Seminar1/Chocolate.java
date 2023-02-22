package Seminar1;

/*На основе кода с урока добавить еще один класс продукта,
(Молоко, шоколад ,и т.п., можно добавить несколько классов),
они должны наследоваться от класса Product, надо переопределить метод toString и
попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine*/

public class Chocolate extends Product{
    private String taste;

    public Chocolate(String name, Double price, String taste) {
        super(name, price);
        this.taste = taste;
    }

    @Override
    public String toString(){
        return String.format("%s taste = %s" , super.toString(), taste);
    }
}


