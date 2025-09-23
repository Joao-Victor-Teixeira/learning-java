package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();

        Pessoas [] vect = new Pessoas[n];
        

        for (int i = 0; i < vect.length; i++) {
            
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }
        double mediaAltura = soma / vect.length;
        
        
        double contadorMenores = 0.0;
          for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16 ) {
                contadorMenores += 1;
            }
        }
        double prctMenores = (contadorMenores / n) * 100;
        
        String nomesMenores = "";
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                nomesMenores += vect[i].getNome() + "\n";
            }
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f %n", prctMenores);
        System.out.print(nomesMenores);
        
        sc.close();
    }
}
