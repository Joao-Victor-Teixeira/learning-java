package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.00));
        prod.add(new Product("Mouse", 50.00));
        prod.add(new Product("Tablet", 350.00));
        prod.add(new Product("Hd Case", 80.90));

        prod.forEach(new PriceUpdate());

        prod.forEach(System.out::println);
    }
}
