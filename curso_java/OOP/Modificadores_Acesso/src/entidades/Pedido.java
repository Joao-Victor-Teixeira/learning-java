package entidades;
import java.util.Date;

public class Pedido {
    private Date date;
    private Produtos produtos;
    
    public Pedido(Date date, Produtos produtos) {
        this.date = date;
        this.produtos = produtos;
        // Como o nome do produto não tem modificador de acesso e está no pacote entidades, não causou nenhum erro.
        this.produtos.nome = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }


}
