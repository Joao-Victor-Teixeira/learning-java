package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class App {
   
    public static final double PI = 3.14159;
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);    


        sc.close();

    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }
}
