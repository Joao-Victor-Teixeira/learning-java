package application;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho da pasta do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        // Lista as pastas 
        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }
        // Lista os arquivos
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }
        // Cria pastas
        boolean sucesso = new File(strPath + "//subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucesso);

        sc.close();
    }
}
