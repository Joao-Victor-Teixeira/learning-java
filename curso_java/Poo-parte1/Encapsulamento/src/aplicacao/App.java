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
        Produtos produto = new Produtos(nome, preco);

       /*
         produto.nome = "Computador" Desa forma não é possivel alterar o nome do produto.
        */
       
        // Após criar um método que possibilida a mudança de atrbutos essa é a forma correta de fazer a atribuição.
        produto.setNome("Computador");
        // Após criar o metodo que permite pegar o nome do produto podemos pedir para exibi-lo;
        System.out.println("Nome após o metodo getNome: " + produto.getNome());
       
       // Após criar od métodos getPreco e Set preco podemos fazer as alterações e acessar os dados
       produto.setPreco(1200.00);
       System.out.println("Preço após as alterações: " + produto.getPreco());
       
       //Propsitalmente deixei esse método para mostrar a "proteção" que foi feito pelo Encapsulamento
       produto.setQuantidade();
       
       
        System.out.println();
        System.out.println("Dados do produto:" + produto);

        System.out.println();
        System.out.println("Entre com o número de produtos para serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
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