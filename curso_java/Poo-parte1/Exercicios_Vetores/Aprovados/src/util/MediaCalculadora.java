package util;

import entidades.Aluno;

public class MediaCalculadora {

    // Método para calcular a media de um aluno
    public static double calcularMedia(Aluno aluno){
        return (aluno.getNota1() + aluno.getNota2()) / 2.0;
    }

      public static boolean aprovadoOuReprovado(Aluno aluno) {
        double media = calcularMedia(aluno); 
        return media >= 6.0;
    }
}
