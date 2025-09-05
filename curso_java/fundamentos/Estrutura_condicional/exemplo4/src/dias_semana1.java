import java.util.Scanner;

public class dias_semana1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia ; 
        if (x == 1) {
            dia = "domingo";
        }
        else if (x == 2) {
            dia = "segunda";
        }
        else if (x == 3) {
            dia = "terça";
        }
        else if (x == 4) {
            dia = "quarta";
        }
        else if (x == 5) {
            dia = "quinta";
        }
        else if (x == 6) {
            dia = "sexta";
        }
        else if (x == 7) {
            dia = "sabado";
        }
        else {
            dia = "valor invalido";
        }

        System.out.printf("Dia da semana : %s", dia);

        sc.close();
    }

}
