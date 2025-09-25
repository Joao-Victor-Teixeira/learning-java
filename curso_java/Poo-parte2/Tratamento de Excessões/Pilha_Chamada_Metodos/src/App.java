
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      metodo1();
      System.out.println("Fim do progama");  
    }
    public static void metodo1(){
        System.out.println("***INICIO DO METODO 1***");
        metodo2();
        System.out.println("***FIM DO METODO 1***");
    }

    public static void metodo2(){
        System.out.println("***INICIO DO METODO 2***");
        Scanner sc = new Scanner(System.in);
        try{ 
        String[] vect = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        System.out.println(vect[posicao]);
        }    
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Inválida.");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("Erro de Input.");
        }
        System.out.println("***FIM DO METODO 2***");
        sc.close();
    }
}