package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades_enum.StatusPedido;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        StatusPedido os1 = StatusPedido.ENTREGUE;
        StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
