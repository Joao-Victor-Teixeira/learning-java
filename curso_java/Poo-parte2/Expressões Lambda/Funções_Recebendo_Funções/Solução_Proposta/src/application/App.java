package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.ProductService;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.00));
		prod.add(new Product("Mouse", 50.00));
		prod.add(new Product("Tablet", 350.50));
		prod.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteretSum(prod, p -> p.getName().charAt(0) == 'T');

        System.out.println("Soma = " + String.format("%.2f", sum));
    }
}
