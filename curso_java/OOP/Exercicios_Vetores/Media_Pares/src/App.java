import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no vetor? ");
        int n = sc.nextInt();

        // Leitura dos dados
        int vect[] = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("digite um numero: ");
            vect[i] = sc.nextInt();
        }
        // "Processamento dos dados"
        int contPares = 0;
        int somaPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i]% 2 == 0) {
                somaPares += vect[i];
                contPares ++;
            }        
        }
        if (contPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else{
            double media = (double) somaPares / contPares;
            System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
        }
        sc.close();
    }
}
