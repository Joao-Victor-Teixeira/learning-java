package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Estudante estudante = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("Faltaram %.2f pontos %n", estudante.pontosFaltando());            
        }
        else{
            System.out.println("APROVADO");
        }
        sc.close();
    }
}
