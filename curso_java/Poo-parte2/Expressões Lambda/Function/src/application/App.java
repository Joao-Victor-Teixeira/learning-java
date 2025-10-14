package application;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Tv", 900.00));
        prod.add(new Product("Mouse", 50.00));
        prod.add(new Product("Tablet", 350.00));
        prod.add(new Product("Hd Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List <String> names = prod.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
