import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat =1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
