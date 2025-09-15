package aplicacao;

import java.util.Scanner;

import entidades.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Estudante [] quartos = new Estudante[10];
        
        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <n; i++) {
            System.out.println(); // Uma quebra de linha pra organização
            System.out.printf("Aluguel #%d%n",i+1);

            // Leitura de dados
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            // Criação do objeto estudante
            Estudante estudante = new Estudante(nome, email);

            // Colocando o objeto no lugar certo do vetor
            quartos[numeroQuarto] = estudante;
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.printf("%d: %s%n", i, quartos[i]);
            }
        }        
        sc.close();
    }
}
