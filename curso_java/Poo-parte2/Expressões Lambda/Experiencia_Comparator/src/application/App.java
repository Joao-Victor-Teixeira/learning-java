package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0)); 

        Collections.sort(list);

        for (Product p : list) {
            System.out.println(p);    
        }
    }
}
