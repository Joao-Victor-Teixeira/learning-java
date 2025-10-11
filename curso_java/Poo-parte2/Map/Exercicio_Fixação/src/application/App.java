package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Digite o caminho completo do arquivo: ");
            String path = sc.nextLine();
            
            Map<String, Integer>  candidate = new HashMap<>();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                
                String line = br.readLine();
                while (line != null) {
                    
                    String[] fields = line.split(",");
                    String name = fields[0];
                    int votes = Integer.parseInt(fields[1]);

                    if (candidate.containsKey(name)) {
					    int votesSoFar = candidate.get(name);
					    candidate.put(name, votes + votesSoFar);
				}
				else {
					candidate.put(name, votes);
				}
				
				    line = br.readLine(); 
                    
                }
                for (String key : candidate.keySet()) {
                    System.out.println(key +  ": " + candidate.get(key));
                }
            } 
            catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        
        sc.close();
    }
}
