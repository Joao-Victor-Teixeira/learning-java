import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.err.print("Quantos números você vai digitar? ");
        int n =sc.nextInt();
        int [] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d%n",vect[i]);
            }
        }

       sc.close();
    }

}
