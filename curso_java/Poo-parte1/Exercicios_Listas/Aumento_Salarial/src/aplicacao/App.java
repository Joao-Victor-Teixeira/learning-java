package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.print("Quantos empregados serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Empregado #" + i + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome =  sc.nextLine();

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Empregado empregados = new Empregado(id, nome, salario);
            list.add(empregados);
        }

        System.out.println();
        System.out.print("Entre com o Id do empregado que terá aumento de salário: ");
        int idAumento = sc.nextInt();
        Empregado empregados = list.stream().filter( x -> x.getId() == idAumento).findFirst().orElse(null);
        if (empregados == null) {
            System.out.println("Esse id não existe!");
        }
        else{
            System.out.print("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            empregados.aumentarSalario(porcentagem);
        }

        System.out.println("Lista dos empregados: ");
        for (Empregado empregado : list) {
            System.out.println(empregado);
        }
        sc.close();
    }
}
