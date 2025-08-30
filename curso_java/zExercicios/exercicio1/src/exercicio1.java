import java.io.PrintStream;
import java.util.Locale;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
     String produto1, produto2 ;
     int idade , code;
     double preco1, preco2, medida;
     char genero;
    
     produto1 = "Computador";
     preco1 = 2100.00 ; 
     
     produto2 = "Mesa de escritorio";
     preco2 = 650.00;
     
     idade = 30;
     code = 5290;
     genero = 'F';
     medida = 53.234567;


     System.out.println("Produtos:");
     System.out.printf("%s, cujo preço é R$ %.2f%n",produto1,preco1);
     System.out.printf("%s, cujo preço é de R$ %.2f%n", produto2,preco2);

     System.out.println("Registro:");
     System.out.printf("Cliente com %d anos de idade, código: %d , e sexo: %c%n ",idade,code,genero);

     System.out.println("Medida com oito casas decimais:");
     System.out.println(medida);
     System.out.printf("Arredondado(três casas decimais)%n %.3f %n", medida);
     
     System.out.println("Ponto decimal no padrão americano:");
     Locale.setDefault(Locale.US);
     System.out.printf("%.3f", medida);



        
    }    

}

