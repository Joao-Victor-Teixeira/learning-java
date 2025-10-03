package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: " + s1.getColor());
        System.out.printf("Area do circulo: %.3f %n ", s1.area());
        System.out.println("Cor do retangulo: " + s2.getColor());
        System.out.printf("Area do retangulo: %.3f %n", s2.area());
    }
}
