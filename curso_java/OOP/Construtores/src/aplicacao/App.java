package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Entre com os dados do produto: ");
        
        System.out.print("Nome: ");
        String nome= sc.nextLine();
        
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();
        
        Produtos produto = new Produtos(nome, preco, quantidade);

        System.out.println();
        System.out.println("Dados do produto:" + produto);

        System.out.println();
        System.out.println("Entre com o número de produtos para serem adicionados ao estoque: ");
        quantidade = sc.nextInt();
        produto.produtosAdicionados(quantidade);
        System.out.println("Dados atualizados:" + produto);

        System.out.println();
        System.out.println("Entre com o número de produtos para serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.produtosRemovidos(quantidade);
        System.out.println("Dados atualizados:" + produto);

        sc.close();
    }
}