package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Informe o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do Contribuinte #"+i+":");
            System.out.print("Pessoa FÍSICA ou JURÍDICA (f/j)?");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (resp == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else{
                System.out.print("Número de funcionarios: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add( new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }
        }
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        double soma = 0.0;
        for (Contribuinte cont : list) {
            double imp = cont.imposto();
            System.out.printf("%s : R$ %.2f %n", cont.getNome(), cont.imposto());
            
            soma += imp;
        }
        System.out.println();
        System.out.printf("TOTAL DE IMPOSTOS: R$ %.2f%n", soma);
        sc.close();
    }
}
