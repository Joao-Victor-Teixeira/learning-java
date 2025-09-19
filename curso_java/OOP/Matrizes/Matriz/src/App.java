import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz (N x N): ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mat = new int[n][n]; // Instanciação da matriz

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int contNegativo = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] < 0) {
                    contNegativo ++;
                }
            }
        }
        System.out.println("Números negativos: " + contNegativo);
        sc.close();
    }
}
