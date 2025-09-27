package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Forma otimizada de abrir e ler arquivos
public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "c:\\temp\\in.txt";
    
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
