package util;

import entidades.Pessoa;

public class Calculadora {
    
    public static double maiorAltura(Pessoa[] pessoas){
       double maior = pessoas[0].getAltura();
       for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > maior) {
                maior = pessoas[i].getAltura();
            }
       }
       return maior;
    }
    public static double menorAltura(Pessoa[] pessoas){
        double menor = pessoas[0].getAltura();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura()< menor) {
                menor = pessoas[i].getAltura();
            }
        }
        return menor;
    }
    public static double mediaAlturaMulheres(Pessoa[] pessoas){
        int contador = 0;
        double alturaMulheres = 0;
        for (int i = 0; i < pessoas.length; i++) {
            char genero = pessoas[i].getGenero();
            if (Character.toUpperCase(genero) == 'F') { // Correção para não bugar caso digite em minusculo
                alturaMulheres += pessoas[i].getAltura();
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }
        return alturaMulheres / contador;
    }
    public static int numeroHomes(Pessoa[] pessoas){
        int contadorHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            char genero = pessoas[i].getGenero();
            if (Character.toUpperCase(genero) == 'M') {
               contadorHomens ++; 
            }
        }
        return contadorHomens;
    }
}
