package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import funcionario.Funcionario;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        
        System.out.print("Impostos: ");
        funcionario.imposto = sc.nextDouble();
        
        
        System.out.print("Qual a porcentagem para aumentar o salario? ");
        
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        
        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);
        
        sc.close();
    }
}
