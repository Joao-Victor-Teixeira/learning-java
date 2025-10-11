package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o caminho do arquivo: ");
        String filePath = sc.nextLine();

        String path = filePath;

        Set<String> users = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                
                String [] fields = line.split(" ");
                String name = fields[0];
                
                users.add(name);  
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro! " + e.getMessage());
        }

        int totalUsers = users.size();
        System.out.printf("Total de usuários: %d%n", totalUsers);

        sc.close();
    }
}
