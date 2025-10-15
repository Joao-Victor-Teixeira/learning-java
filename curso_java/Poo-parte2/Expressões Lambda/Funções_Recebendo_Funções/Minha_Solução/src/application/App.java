package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.00));
        prod.add(new Product("Mouse", 50.00));
        prod.add(new Product("Tablet", 350.00));
        prod.add(new Product("HD Case", 80.90));

        
        double sum = prod.stream()
            .filter(p -> p.getName().toUpperCase().charAt(0) == 'T')
            .map(Product::getPrice)
            .reduce(0.0, Double::sum); 

        System.out.println(sum);     
   
    }
}
