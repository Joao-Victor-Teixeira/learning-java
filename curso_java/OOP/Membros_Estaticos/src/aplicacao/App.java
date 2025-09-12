package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Cauculador;

public class App {
   
    
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cauculador calc = new Cauculador();

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);    


        sc.close();

    }


}
