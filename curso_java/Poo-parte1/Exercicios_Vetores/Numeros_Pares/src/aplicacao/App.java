package aplicacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        sc.nextLine(); // Limpa o buffer
        // Armazena todos os numero no vetor 
        System.out.println("Números pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 ==0) { // Verifica quais desses numeros são pares
                System.out.print(""+ vect[i]+",");
            }
        }
        System.out.println(); //Limpa o buffer da primeira seção
        // Conta quantos numeros pares tem no vetor
        int contadorPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if ((vect[i]) % 2 ==0) {
                contadorPares += 1;
            }
        }
        System.out.printf("Quantidade de números pares %d%n",contadorPares);
        sc.close();
    }
}
