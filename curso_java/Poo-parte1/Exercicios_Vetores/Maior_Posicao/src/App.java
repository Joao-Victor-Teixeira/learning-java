import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        System.out.println(); // Limpa o buffer

        double [] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        sc.nextLine(); // Limpa o buffer
        
        
        double maior = vect[0];
        int posicaoMaior= 0; 
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior ) {
                maior = vect[i];
                posicaoMaior = i+1; // Considerei o indice começando em 1 não em 0.   
            }
        } 
        System.out.printf("Maior valor: %.1f%n",maior);
        System.out.printf("Posição do maior valor: %d%n",posicaoMaior);
        
        
        sc.close();

    }
}
