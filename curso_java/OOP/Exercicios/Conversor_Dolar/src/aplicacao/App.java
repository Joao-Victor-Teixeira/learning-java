package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar hoje? ");
        double cotacao = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double valorDolar = sc.nextDouble();
        System.out.printf("Valor a ser pago em reais: R$ %.2f", ConversorMoeda.conversor(cotacao, valorDolar));

        sc.close();
        
    }
}
