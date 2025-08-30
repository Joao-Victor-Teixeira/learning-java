import java.util.Scanner;
import java.util.Locale;

public class entrada_dados3 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
       
        System.out.println("Você digitou: " + x);
        
        sc.close();
    }
}
