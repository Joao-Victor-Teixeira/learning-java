package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import enums.Cor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.print("Entre com o número de figuras: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da figura #"+i+":");
            System.out.print("Retâgulo ou Círculo (r/c)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next());
            if (resp == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(cor, altura, largura));
            }
            else{
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(cor, raio));
            }    
        }
        System.out.println();
        System.out.println("ÁREAS DAS FIGURA:");
        for (Forma forma : list) {
            System.out.println(String.format("%.2f", forma.area()));
        }


        sc.close();
    }
}
