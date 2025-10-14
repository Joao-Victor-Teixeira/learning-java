package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.0));
        prod.add(new Product("Mouse", 50.0));
        prod.add(new Product("Tablet", 350.0));
        prod.add(new Product("HD Case", 80.90));

        prod.removeIf(Product:: nonStaticProductPredicate);

        prod.forEach(System.out::println);
    }
}
