import java.util.Locale;
import java.util.Scanner;

// Modo inadequado de fazer a repetição
/*public class doWhile {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5 + 32;
        System.out.printf("Edquivalente em Fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        char resp = sc.next().charAt(0);

            
             
            while (resp != 'n') {
                System.out.print("Digite a temperatura em Celsius: ");
                C = sc.nextDouble();
                F = 9.0 * C / 5 + 32;
            System.out.printf("Edquivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
                resp = sc.next().charAt(0); 
            
        }

        sc.close();
    }
}
*/

public class doWhile {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em Ceusius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja continuar (s/n):?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');


        sc.close();
    }
}