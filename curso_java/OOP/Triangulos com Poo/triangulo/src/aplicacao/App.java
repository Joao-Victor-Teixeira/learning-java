package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x , y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os 3 lados do triangulo X :");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        double P = (x.a + x.b + x.c) /2;
        double areax = Math.sqrt(P * (P - x.a) * (P - x.b ) * (P - x.c));
         
        System.out.println("Digite os 3 lados do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double P2 = (y.a + y.b + y.c) / 2;
        double areay = Math.sqrt(P2 * (P2 - y.a) * (P2 - y.b) * (P2 - y.c));
        
        
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
