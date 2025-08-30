import java.io.PrintStream;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.out.println("Olá mundo!");
        System.out.println("Bom dia!");
        
        System.out.print("O comando Print não quebra linha");
        System.out.println("Como podemos ver aqui");

        System.out.println("Já o comando Println, quebra a linha.");
        System.out.println("Como também podemos ver aqui.");

        int y = 32;
        int z = 30;
        int soma = z + y;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",y + x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", y + x);

        System.out.println("A soma de "+ z + " + " + y + " é igual a "+ soma);
        System.out.printf("Sozinho eu consegui declarar as variáveis %d e %d e a soma entre elas que é = %d%n", y, z, soma);
        System.out.println("A linha acima foi uma String formatada.");

        String nome = "João";
        int idade = 27;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais" ,nome, idade, renda);
    }

}


