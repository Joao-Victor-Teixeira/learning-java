package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.err.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine(); //Limpa o buffer
        Pessoa[] pessoas = new Pessoa[n]; 

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da "+ (i+1)+"a pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Gênero da "+ (i+1)+"a pessoa: ");
            char genero = sc.next().charAt(0);
            sc.nextLine();
        }
        sc.close();
    }
}
