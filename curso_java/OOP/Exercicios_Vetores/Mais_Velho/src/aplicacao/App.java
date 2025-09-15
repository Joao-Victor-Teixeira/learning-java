package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa [] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1)+"a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa(nome, idade);
        }
        sc.close();
    }
}
