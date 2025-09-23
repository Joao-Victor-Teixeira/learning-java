package util;

public class OperacoesVetores {
    

    public static int [] somar(int[] vetorA, int[] vetorB){
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        return vetorC;
    }

    public static void imprimir(int[] vetor){
        System.out.println("Valores resultantes:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf ("%d%n",vetor[i]);  
        }
    }  
}
