package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(App::compareProducts);

        list.forEach(System.out::println);
    }
}
