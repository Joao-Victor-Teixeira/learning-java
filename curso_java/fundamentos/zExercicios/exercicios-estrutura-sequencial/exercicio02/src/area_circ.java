import java.util.Scanner;

public class area_circ {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     
     double raio, pi, area;

     raio = sc.nextDouble();
     pi = 3.14159; 
     area = Math.pow(raio, 2) * pi;
     
     
        System.out.printf("Area = %.4f", area);
     sc.close();   
    }
}
