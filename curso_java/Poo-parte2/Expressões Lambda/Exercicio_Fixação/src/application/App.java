package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employe;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho completo do arquivo: ");
        String path = sc.nextLine();

        System.out.print("Digite o salário: ");
        double basedSalary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            List<Employe> employes = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String [] fields = line.split(",");
                employes.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            
            System.out.println("Email das pessoas cujo salário é superior a " + String.format("%.2f", basedSalary));
            List<String> emailList = employes.stream()
                    .filter(e -> e.getSalary() > basedSalary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            
            emailList.forEach(System.out::println);        

            double sumSalaries =  employes.stream()
                    .filter(e -> e.getName().trim().toUpperCase().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Soma salarios das pessoas que começam com a letra 'M': " + String.format("%.2f", sumSalaries));      

        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());    
        }
        sc.close();
    }
}
