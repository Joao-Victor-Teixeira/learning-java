package aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++) {
            soma += vect[i];
        }
        double media = soma / n;

        System.out.printf("Média das alturas: %.2f%n ", media);

        sc.close();
        
    }
}
