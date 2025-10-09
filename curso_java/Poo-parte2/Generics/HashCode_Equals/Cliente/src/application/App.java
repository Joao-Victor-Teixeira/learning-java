package application;

import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Compara os objetos por igualdade em conteudo
        System.out.println();
        System.out.println(c1 == c2); // Aqui se compara as referencias de memoria.
        System.out.println();
        System.out.println(s1 == s2); // Nesse caso o compilador da um tratamento especial e o resultado é true

    }
}
