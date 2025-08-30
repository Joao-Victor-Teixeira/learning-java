import java.util.Scanner;

public class entrada_dados6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc. nextDouble();

        System.out.printf("Você digitou o texto %s , o número %d e o float %.2f ", x , y , z);

        sc.close();
    }
}
