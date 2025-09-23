package util;

public class Calculadora {
    // Função para caucular e devolver a media 
    public static double calcularMedia(double[] vect){
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i]; 
        }
        double media = soma / vect.length;
        return media;
    }
    // Função para saber quantos e quais valores estão abaixo da media
    public static double abaixoMedia(double[] vect, double media){
        int abaixo = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
                abaixo += 1;
            }
        }
        return abaixo;    
    }
   
}
