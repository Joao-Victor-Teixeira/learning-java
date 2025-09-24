package entities;

public class ProdutoImportado extends Produto {
    
    private Double taxaImport;

    public ProdutoImportado() {
        
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImport) {
        super(nome, preco);
        this.taxaImport = taxaImport;
    }

    public Double getTaxaImport() {
        return taxaImport;
    }

    public void setTaxaImport(Double taxaImport) {
        this.taxaImport = taxaImport;
    }
    
    @Override
    public String etiquetaPreco() {
        return getNome() 
         + " R$ " 
         + String.format("%.2f", precoTotal()) 
         + " (Taxa de alfândega: R$ " 
         + String.format("%.2f", getTaxaImport()) 
         + ")";
    }

    public Double precoTotal() {
        return preco + taxaImport;
    }
}
