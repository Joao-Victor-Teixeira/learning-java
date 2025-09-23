package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
       
        Pessoa [] pessoas = new Pessoa[n];
       
        // Leitura de dados
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1)+"a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            pessoas[i] = new Pessoa(nome, idade);
        }
        // Processamento de dados
        int maior = pessoas[0].getIdade();
        String nomeMaior = pessoas[0].getNome();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maior) {
                maior = pessoas[i].getIdade() ;
                nomeMaior = pessoas[i].getNome();
            }
        }
        
        System.out.printf("Pessoa mais velha: %s.%n",nomeMaior);
        
        sc.close();
    }
}
