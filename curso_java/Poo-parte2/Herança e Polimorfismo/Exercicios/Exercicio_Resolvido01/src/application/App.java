package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        

        System.out.print("Entre com o número de funcionarios: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionario #"+i+": ");
            System.out.print("Terceirizado (s/n)?");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            if (resp == 'n') {
                Funcionario funcionario = new Funcionario(null, null, null);
                System.out.print("Nome: ");
                funcionario.setNome(sc.nextLine());
                System.out.print("Horas: ");
                funcionario.setHoras(sc.nextInt());
                sc.nextLine();
                System.out.print("Valor por hora: ");
                funcionario.setValorPorHora(sc.nextDouble());
                sc.nextLine();
                listaFuncionarios.add(funcionario);
            } 
            if (resp == 's') {
                FuncionarioTercerizado  funcionarioTerceirizado = new FuncionarioTercerizado(null, null, null, null);
                System.out.print("Nome: ");
                funcionarioTerceirizado.setNome(sc.nextLine());
                System.out.print("Horas: ");
                funcionarioTerceirizado.setHoras(sc.nextInt());
                sc.nextLine();
                System.out.print("Valor por hora: ");
                funcionarioTerceirizado.setValorPorHora(sc.nextDouble());
                sc.nextLine();
                System.out.print("Cobrança adicional: ");
                funcionarioTerceirizado.setCobrancaAdicional(sc.nextDouble());
                sc.nextLine();
                listaFuncionarios.add(funcionarioTerceirizado);
            }
            
            
        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");
            
        for (Funcionario func : listaFuncionarios) {    
            System.out.printf("%s - R$ %.2f", func.getNome(), func.pagamento());
        }
        sc.close();
    }
}
