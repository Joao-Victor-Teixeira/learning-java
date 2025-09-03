import java.util.Locale;
import java.util.Scanner;

public class valor_sal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        int nf, ht;
        double sal, pg;

        nf = sc.nextInt();
        ht = sc.nextInt();
        sal = sc.nextDouble();
        
        pg = sal * ht;

        System.out.printf("NUMBER = %d %n SALARY = %.2f %n",nf,pg);
        sc.close();




    }
}
