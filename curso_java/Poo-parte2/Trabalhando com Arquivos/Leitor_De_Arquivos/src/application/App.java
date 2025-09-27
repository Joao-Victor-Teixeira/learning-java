package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("C:\\temp\\in.txt"); // Instanciação da classe File e caminho do arquivo
        Scanner sc = null; // Instancianto Scanner como nulo
        try {
            sc = new Scanner(file); // Atribuindo o arquivo como argumento no Scanner
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            if(sc != null){ // Garantindo que qualquer exceção seja tratada
                sc.close();
            }
            
        }
        
    }
}
