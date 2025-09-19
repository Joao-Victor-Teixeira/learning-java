import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas linhas tem a matriz: ");
        int n = sc.nextInt();
        
        System.out.print("Digite quantas colunas tem a matriz: ");
        int m = sc.nextInt();
        

        int mat [][] = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.print("Digite o elemento:");
        int x = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: "+ i +"," + j + ":");
                
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (i < mat.length -1) {
                        System.out.println("Abaixo: "+ mat[i+1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: "+ mat[i][j-1]);
                    }
                    if (j < mat[i].length -1){
                        System.out.println("Direita: "+ mat[i][j+1]);
                    }
                    System.out.println();
                }    
            }
        }

        sc.close();
    }
}
