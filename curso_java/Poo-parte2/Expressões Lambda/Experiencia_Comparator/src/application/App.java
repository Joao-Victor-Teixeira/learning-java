package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0)); 

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }   
        };

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);    
        }
    }
}
