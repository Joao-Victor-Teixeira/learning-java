import java.util.Scanner;

public class verif_multiplos {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Digite dois valores para saber se são múltiplos: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            
            System.out.printf("Os valores %d e %d SÃO MULTIPLOS;  %n",x, y);
        }    
        else{
            System.out.printf("Os valores %d e %d NÃO SÃO MULTIPLOS. %n", x, y);
        }
       
        sc.close();

    }
}
