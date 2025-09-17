package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import util.Calculadora;

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
            pessoas[i] = new Pessoa(altura, genero);
        }

        double menorAltura = Calculadora.menorAltura(pessoas);
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        double maiorAltura = Calculadora.maiorAltura(pessoas);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        
        double mediaAlturaMulheres = Calculadora.mediaAlturaMulheres(pessoas);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);

        int numeroHomes = Calculadora.numeroHomes(pessoas);
        System.out.printf("Número de homens = %d%n", numeroHomes);
        sc.close();
    }
}
