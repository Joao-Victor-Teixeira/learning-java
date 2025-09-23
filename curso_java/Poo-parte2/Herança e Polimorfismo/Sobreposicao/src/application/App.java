package application;

import entities.Conta;
import entities.ContaEmpresas;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());

        //Sobreposição
        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        // Uso da palavra super
        Conta conta3 = new ContaEmpresas(1003, "Comercio.SA", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());
    }
}

