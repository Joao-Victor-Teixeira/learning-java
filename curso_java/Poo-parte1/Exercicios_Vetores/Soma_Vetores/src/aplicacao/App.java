package aplicacao;

import java.util.Scanner;

import util.OperacoesVetores;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        System.out.println("Digite os valores do vetor A:");
        int [] vetorA = new int[n];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        int [] vetorB = new int[n];
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        int[] vetor = OperacoesVetores.somar(vetorA, vetorB);

        OperacoesVetores.imprimir(vetor);
        sc.close();
    }
}
