package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta ;

        System.out.print("Entre com o número da conta: ");
        int numeroct = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do titular da conta: ");
        String nome = sc.nextLine();
        
        
        char resp;
        do {
            System.out.print("Gostaria de realizar um depósito inicial (s/n)? ");
            resp = sc.next().charAt(0);
            sc.nextLine(); // Limpa o buffer
        } while (resp != 's' && resp != 'n');

        if (resp == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double valorDeposito = sc.nextDouble();
            conta = new ContaBancaria(numeroct, nome, valorDeposito);
        }else{
            conta = new ContaBancaria(numeroct, nome);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta);        
        System.out.print("Digite o valor do depósito: ");
        conta.depositar(sc.nextDouble());
        System.out.println("Dados atualizados:");
        System.out.println(conta);
        
        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados atualizados:");
        System.out.println(conta);
        sc.close();
    }
}
