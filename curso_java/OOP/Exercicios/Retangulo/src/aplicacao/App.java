package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a LARGURA e ALTURA do RETÂGULO:");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f %n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f %n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f %n", retangulo.diagonal());

        sc.close();
    }
}