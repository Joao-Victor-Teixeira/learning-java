import java.util.Scanner;

public class verif_impares {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i=0; i<=x; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
