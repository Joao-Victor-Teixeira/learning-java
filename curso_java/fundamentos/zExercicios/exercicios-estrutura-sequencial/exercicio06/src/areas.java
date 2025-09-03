import java.util.Locale;
import java.util.Scanner;

public class areas{

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, circ, trap, quad, ret, pi;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		tri = a * c / 2.0;
		circ = Math.pow(c, 2) * pi;
		trap = (a + b) / 2.0 * c;
		quad = b * b;
		ret = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}
}