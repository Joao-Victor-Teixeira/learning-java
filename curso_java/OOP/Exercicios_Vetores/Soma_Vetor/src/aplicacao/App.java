package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declarando variavel e vetor
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double [] vect =  new double[n];
        
        // Armazenar os valores no vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();
        // Mostrar os valores armaezados no vetor
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf(" %.1f ",vect[i]);    
        }

        System.out.println(); // quebrar linha entre os resultados
        // Somar os valores guardados
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
            
        }
        // Mostar a soma dos valores guardados
        System.out.printf("SOMA = %.2f",soma); 
       
        // Caucular a media dos valores somados
        System.out.println();
        double media = soma / n;
        System.out.printf("MÉDIA = %.2f",media);
        
        sc.close();
    }
}
