package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        try{ 
        String[] vect = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        System.out.println(vect[posicao]);
        }    
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Inválida.");
        }
        catch(InputMismatchException e){
            System.out.println("Erro de Input.");
        }
        System.out.println("Fim do programa.");
        sc.close();
    }
}
