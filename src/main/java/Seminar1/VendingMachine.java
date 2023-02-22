package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Double money = 0.0;
    private List<Product> products = new ArrayList<>();
    public List<Product> getProducts() {
        return products;
    }
    public VendingMachine() {
        this.money = money;
    }

    public Double getMoney() {
        return money;
    }
    public VendingMachine addProduct(Product product){
        this.products.add(product);
        return this;
    }
    public Product findProduct(String name){
        for (Product searchName : getProducts() ) {
            if (searchName.getName().equals(name)){
                return searchName;
            }
        }
        return null;
    }

    public Product buy(String name, Double price){
        Product something = findProduct(name);
        if (something == null ) return null;
        if (price.equals(something.getPrice())) {
            products.remove(something);
            money += price;
            return something;
        }
        System.out.println("price is wrong");
        return null;
    }

    @Override
    public String toString(){
        StringBuilder wdProducts = new StringBuilder();

        for (Product prod : this.getProducts() ) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }


}