import java.util.Locale;
import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os 3 lados do triangulo X :");
        double xa = sc.nextDouble();
        double xb = sc.nextDouble();
        double xc = sc.nextDouble();
        
        double P = (xa + xb + xc) /2;
        double areax = Math.sqrt(P * (P - xa) * (P -xb ) * (P - xc));
        
        
        System.out.println("Digite os 3 lados do triangulo Y");
        double ya = sc.nextDouble();
        double yb = sc.nextDouble();
        double yc = sc.nextDouble();

        double P2 = (ya + yb + yc) / 2;
        double areay = Math.sqrt(P2 * (P2 - ya) * (P2 - yb) * (P2 - yc));
        
        
        System.out.printf("Area do triangulo X : %.4f %n",areax);
        System.out.printf("Area do triangulo Y : %.4f %n",areay);


        if (areax > areay) {
            System.out.println("Maior area : Triangulo X");
        }
        else{
            System.out.println("Maior area : Triangulo Y");
        }

        sc.close();
    }
}
