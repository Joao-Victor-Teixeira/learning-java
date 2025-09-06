import java.util.Scanner;

public class posto {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opc = sc.nextInt();

        while (opc != 4) {
            if (opc == 1) {
                alcool += 1;
            }
            else if (opc == 2) {
                gasolina += 1;                
            }
            else if (opc == 3){
                diesel += 1;
            }
           
            
            
            opc = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d %n", alcool);
        System.out.printf("Gasolina: %d %n", gasolina);
        System.out.printf("Diesel: %d %n", diesel);

        sc.close();    
    }
}
