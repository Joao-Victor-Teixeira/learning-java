import java.util.Scanner;

public class verif_pares {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número para saber se é PAR ou ÍMPAR:");
        x= sc.nextInt();

        if (x % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}
