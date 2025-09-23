package application;

import entities.Conta;
import entities.ContaEmpresas;
import entities.ContaPoupanca;

public class App {

    public static void main(String[] args) throws Exception {
        
        Conta conta = new Conta(1001, "Alex", 0.0);
        ContaEmpresas contaEmpresas = new ContaEmpresas(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        
        Conta conta1 = contaEmpresas;
        Conta conta2 = new ContaEmpresas(1003, "Bob", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        ContaEmpresas conta4 = (ContaEmpresas)conta2; // O Casting tem que ser feito manualmente
        conta4.emprestimo(100.0);

        //ContaEmpresas conta5 = (ContaEmpresas)conta3; // Se o DOWCASTING não for permitido pela execução do programa devemos testar
        if (conta3 instanceof ContaEmpresas) {
            ContaEmpresas conta5 = (ContaEmpresas)conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo");
        }
        if (conta3 instanceof ContaPoupanca){
            ContaPoupanca conta5 = (ContaPoupanca)conta3;
            conta5.atualizarSaldo();
            System.out.println("Atualização de saldo");
        }
    }
}