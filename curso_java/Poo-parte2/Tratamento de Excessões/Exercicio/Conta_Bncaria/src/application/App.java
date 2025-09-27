package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.excepitions.DominioException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os dados da conta: ");
            System.out.print("Número: ");
            int numeroConta = sc.nextInt();
            System.out.print("Ttular: ");
            String titular = sc.nextLine();
            sc.nextLine();
            System.out.print("Deposito inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();
            
            Conta conta = new Conta(numeroConta, titular, saldo, limiteSaque);

            System.out.print("Digite o valor a ser sacado: ");
            double quantia = sc.nextDouble();
            conta.saque(quantia);
            System.out.printf("Novo saldo : %.2f %n", conta.getSaldo());
        } 
        catch (DominioException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }   
        catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }
        sc.close();
    }
}
