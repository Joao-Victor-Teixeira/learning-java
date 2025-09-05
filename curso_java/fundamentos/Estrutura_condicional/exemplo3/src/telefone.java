import java.util.Locale;
import java.util.Scanner;

public class telefone {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt() ; 
       
        double conta = 50.0;
        if (min > 100) {
            conta += (min - 100) * 2.0 ;
        }

        System.out.printf("valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}
