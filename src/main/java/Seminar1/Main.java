package Seminar1;

public class Main {
    public static void main(String[] args) {

        VendingMachine store = new VendingMachine();

        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new CursedProducts("milk" , 56.65, 7))
                .addProduct(new Snack("Cheetos", 55.0, 80))
                .addProduct(new Chocolate("Oreo", 80.2, "Milk"));


        System.out.println(store);
        store.buy("Cheetos", 55.0);
        System.out.println(store);
        store.buy("Oreo", 80.2);
        System.out.println(store);

    }

}