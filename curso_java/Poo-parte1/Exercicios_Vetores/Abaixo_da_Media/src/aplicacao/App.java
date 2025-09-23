package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        double vect [] = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        sc.nextLine();

        // Implementação das Funçoes de caucular e abaixo da media
        Calculadora.abaixoMedia(vect, n);
        double mediaCauculada = Calculadora.calcularMedia(vect);

        System.out.printf("Média do vetor = %.3f%n",mediaCauculada);
        System.out.println("Elementos abaixo da media:");
        Calculadora.abaixoMedia(vect, mediaCauculada); 
        
        sc.close();
    }
}
