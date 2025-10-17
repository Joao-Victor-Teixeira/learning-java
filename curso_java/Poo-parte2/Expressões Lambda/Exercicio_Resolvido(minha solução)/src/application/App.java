package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho completo do arquivo: ");
        String path = sc.nextLine();

        List<Product> prod = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();

            while (line != null) {
                String [] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                prod.add(new Product(name, price));
                line = br.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        double totSum = prod.stream()
        .mapToDouble(x -> x.getPrice())
        .sum();

        double media = totSum / prod.size();

        List<String> nameProd = prod.stream()
        .filter(x -> x.getPrice() < media)
        .map(Product::getName)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        
        System.out.printf("Média de preços: R$ %.2f %n" , media);
        nameProd.forEach(System.out::println);
        sc.close();

    }
}
