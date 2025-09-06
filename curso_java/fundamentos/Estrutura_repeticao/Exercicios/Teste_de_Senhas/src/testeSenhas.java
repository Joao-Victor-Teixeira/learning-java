import java.util.Scanner;

public class testeSenhas {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.println("Digite sua senha: ");
        int tentativa = 0;
        
        while (tentativa != senha) {
            tentativa = sc.nextInt();
            System.out.println("Senha Inválida");   
        }
        System.out.println("Acesso Permitido");

        sc.close();


    }
}
