package application;

import entities.Conta;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        
        Conta x = new Conta(1020, "Alex", 1000.0);
        Conta y = new ContaPoupanca(1023, "Maria", 1000.00, 0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }
}