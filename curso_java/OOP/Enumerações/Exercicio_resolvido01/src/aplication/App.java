package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Trabalhador;
import entities_enum.NivelTrabalhador;
import entities.Departamento;
import entities.HorasDeContrato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Ente com o nome do departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double baseSalario = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
        baseSalario ,new Departamento(departamento) );

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Emtre com os dados do contrato #" +i+":");
            System.out.print("Data (DD/MM/YYYY): ");    
            LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);

            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            
            System.out.print("Duração (Horas): ");
            int horas = sc.nextInt();

            HorasDeContrato contrato = new HorasDeContrato(dataContrato, valorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mês e ano para calcular os ganhos: (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Ganhos: " + mesAno + ": " + String.format("%.2f", trabalhador.ganhos(ano, mes)));

        sc.close();
    }
}
