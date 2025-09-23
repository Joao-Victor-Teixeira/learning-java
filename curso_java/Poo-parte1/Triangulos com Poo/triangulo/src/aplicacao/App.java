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
        
        double areaX = x.area();
        
        System.out.println("Digite os 3 lados do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaY = y.area();

        System.out.printf("Area do triangulo X : %.4f %n",areaX);
        System.out.printf("Area do triangulo Y : %.4f %n",areaY);


        if (areaX > areaY) {
            System.out.println("Maior area : Triangulo X");
        }
        else{
            System.out.println("Maior area : Triangulo Y");
        }

        sc.close();
    }
}
