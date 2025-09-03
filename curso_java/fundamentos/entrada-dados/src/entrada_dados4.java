import java.util.Scanner;

public class entrada_dados4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        System.out.println("Você Digitou: " + x);

        sc.close();
    }
}
