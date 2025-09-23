package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import enums.StatusPedido;

public class Pedido {
    
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate momento;
    private StatusPedido status;

    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    
    public Pedido(LocalDate momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    
    public LocalDate getMomento() {
        return momento;
    }



    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }



    public StatusPedido getStatus() {
        return status;
    }



    public void setStatus(StatusPedido status) {
        this.status = status;
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public List<ItemPedido> getItens() {
        return itens;
    }



    public  void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public  void removerItem(ItemPedido item){
        itens.remove(item);
    }

    public  Double total(){
        double soma = 0.0;
        for (ItemPedido item : itens) {
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(fmt.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens no pedido: \n");
        for (ItemPedido item : itens) {
            sb.append(item + "\n");
        }

        sb.append("Valor total: R$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
