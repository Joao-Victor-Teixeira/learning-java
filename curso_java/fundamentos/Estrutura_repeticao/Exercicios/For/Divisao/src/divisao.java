import java.util.Scanner;

public class divisao {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for ( int i=0; i<n; i++ ) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (y == 0) {
                System.out.println("Divisão Impossivel");
            }
            else{
               double divsao = (double) x /y;
               System.out.printf("%.1f%n", divsao);
            }

           
        }

        sc.close();
    }
}
