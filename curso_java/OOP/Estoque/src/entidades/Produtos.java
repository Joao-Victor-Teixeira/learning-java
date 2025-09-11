package entidades;

public class Produtos {
    
    public String nome;
    public double preco;
    public int quantidade;

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

