package entities;

public class Produto {
    private String nome;
    private Double precoUnitario;
    private Integer quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome, Double precoUnitario, Integer quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public  double fechamentoPedido(){
        return precoUnitario * quantidade;
    }
}
