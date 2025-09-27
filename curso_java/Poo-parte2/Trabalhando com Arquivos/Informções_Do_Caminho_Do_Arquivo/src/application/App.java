package application;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Forma de mostar apenas o nome do arquivo sem o seu caminho
        System.out.println("getName: " + path.getName());


        // Forma de mostrar o caminho do arquivo sem o seu nome
        System.out.println("getParent: " + path.getParent());

        // Fomra de mostrar o caminho completo do arquivo
        System.out.println("getPath: " + path.getPath());

        sc.close();

    }
}
