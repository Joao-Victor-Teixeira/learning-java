import java.util.Scanner;

public class dif_produto {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D, dif ;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        dif = (A*B) - (C*D);
        
        System.out.printf("DIFERENÇA ENTRE PRODUTOS = %d", dif);
        
        sc.close();

    }
}
