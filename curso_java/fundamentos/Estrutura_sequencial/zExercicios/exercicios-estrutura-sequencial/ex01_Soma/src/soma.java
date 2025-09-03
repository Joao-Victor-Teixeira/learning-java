import java.util.Scanner;

public class soma {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int x,y,soma;

        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;

        System.out.printf("A soma de %d + %d = %d %n",x, y, soma);

        sc.close();
    }
}
