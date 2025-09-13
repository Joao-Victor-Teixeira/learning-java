package entidades;

public class Produtos {
    
    //Encapsulando os atributos para não ter acesso diretamente por outras classes.
    private String nome;
    private double preco;
    private int quantidade;

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

    // Método que permite mudar o atributo nome 
    public void setNome(String nome){
        this.nome = nome ;
    }

    // Método que permite o programa principal pegar esse nome
    public String getNome(){
        return nome;
    }

    // Método que permite ler o atribudo preco
    public double getPreco(){
        return preco;
    }

    // Método que permite o programa principal modificar esse preço
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    // Método que permite verificar o estoque, mas por regras de negocios só podemos alterar o valor do estoque caso 
    // tenha uma entrada ou uma saída 
    public int getQuantidade() {
        return quantidade;
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