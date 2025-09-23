package entidades;

public class Produtos {
    
    public String nome;
    public double preco;
    public int quantidade;

    // Declarando o construtor padrão manualmente
    public Produtos(){

    }

    // Construtor recebendo 3 argumentos
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    // Construtor recebendo 2 argumentos para entendermos SOBRECARGA
    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void produtosAdicionados(int quantidade) {
        this.quantidade += quantidade;
    }

    public void produtosRemovidos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome 
            + ", R$ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            +" unidades ,"
            + "Total: R$ " 
            + String.format("%.2f", valorTotalEmEstoque());
    }
}