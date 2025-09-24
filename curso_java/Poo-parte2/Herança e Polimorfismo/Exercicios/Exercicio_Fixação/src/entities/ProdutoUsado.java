package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ProdutoUsado extends Produto {
    
    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataFabricacao;

    public ProdutoUsado() {
        
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public static DateTimeFormatter getFmt() {
        return fmt;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return  dataFabricacao.format(fmt);
    }
    
    @Override
    public String etiquetaPreco() {
            return getNome()
         + " (usado) R$ "
         + String.format("%.2f", getPreco())
         + " (Data de fabricação: "
         + dataFabricacao.format(fmt)
         + ")";
    }
    
}
