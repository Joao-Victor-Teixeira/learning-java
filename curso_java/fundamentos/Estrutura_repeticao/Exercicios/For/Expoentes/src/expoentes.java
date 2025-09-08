import java.util.Scanner;

public class expoentes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int nm = i;
            int qd = i * i;
            int cb = i * i * i;
            System.out.printf("%d %d %d %n",nm ,qd, cb);            
        }

        sc.close();
    }
}
