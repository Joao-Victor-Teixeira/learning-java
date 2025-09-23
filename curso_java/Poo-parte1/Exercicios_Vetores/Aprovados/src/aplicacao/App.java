package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;
import util.MediaCalculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
       sc.nextLine();
        Aluno [] aluno = new Aluno[n];

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "+ (i+1)+"o aluno:");
            
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer
            aluno[i] = new Aluno(nome, nota1, nota2);
        }
       
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < aluno.length; i++) {
            MediaCalculadora.calcularMedia(aluno[i]);
            if (MediaCalculadora.aprovadoOuReprovado(aluno[i])) {
                System.out.println(aluno[i].getNome());
            }
            
        }
        System.out.println();
        sc.close();
    }
}
