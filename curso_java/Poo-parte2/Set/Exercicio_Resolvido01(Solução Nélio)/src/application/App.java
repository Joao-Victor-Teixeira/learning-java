package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogyEntry;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Set<LogyEntry> set = new HashSet<>();
            
            String line =br.readLine();
            while (line != null) {
                
                String[] fields = line.split(" ");
                String username = fields[0];
                Instant moment = Instant.parse(fields[1]);
                
                set.add(new LogyEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total de usuarios: " + set.size());

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
