package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.00));
        prod.add(new Product("Mouse", 50.00));
        prod.add(new Product("Tablet", 350.00));
        prod.add(new Product("Hd Case", 80.90));

        double factor = 1.1;

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        prod.forEach(cons);

        prod.forEach(System.out::println);
    }
}
