package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n =sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do Produto #"+i+":");
            System.out.print("COMUM, USADO ou IMPORTADO (c / u / i)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (resp == 'u') {
                System.out.print("Data de fabricação: ");
                LocalDate dataFabricacao = LocalDate.parse(sc.next(), fmt);
                list.add(new ProdutoUsado(nome, preco, dataFabricacao));
            }
            else if (resp == 'i') {
                System.out.print("Taxa de importação: ");
                double taxaImport = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxaImport));
            }
            else{
                list.add(new Produto(nome, preco));
            }
        }
        System.out.println();
        System.out.println("ETIQUETA DE PREÇOS:");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaPreco());
        }

        sc.close();

    }
}
