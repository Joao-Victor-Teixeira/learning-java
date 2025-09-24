package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.ContaEmpresas;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        
       // Conta conta1 = new Conta(1001,"Alex" , 1000.0);// Não podemos instanciar Conta pois é abstrata.
        Locale.setDefault(Locale.US);
        List<Conta> list = new ArrayList<>();

        list.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
        list.add(new ContaEmpresas(1002, "Maria", 1000.0, 400.0));
        list.add(new ContaPoupanca(1004, "Bob",300.0, 0.01));
        list.add(new ContaEmpresas(1005, "Anna",500.0, 500.0));

        double soma = 0.0;
        for (Conta conta : list) {
            soma += conta.getSaldo();
        }
        System.out.printf("Saldo total: %.2f%n", soma);

        for (Conta conta : list) {
            conta.deposito(10.0);
            System.out.printf("Saldo da conta %d: %.2f %n", conta.getNumeroConta() ,conta.getSaldo());
        }
    }
}
