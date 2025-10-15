package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ProductService {
    
    public double filteretSum(List<Product> prod, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p : prod) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }  
        }
        return sum;
    }
}
