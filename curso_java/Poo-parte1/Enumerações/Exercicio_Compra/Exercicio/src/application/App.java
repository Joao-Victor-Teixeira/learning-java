package application;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        LocalDate dataNascimento = LocalDate.parse(sc.next(), fmt);
        
        Cliente cliente = new Cliente(nome, email, dataNascimento);
        
        System.out.println("Entre com o Status do pedido:");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(LocalDate.now(), status, cliente);

        System.out.print("Quantos intens tem o seu pedido? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do item #"+i+" :");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();

            Produto produto = new Produto(nome, preco);

            System.out.print("Quantidde: ");
            int quantitade = sc.nextInt();

            ItemPedido itemPedido = new ItemPedido(quantitade, preco, produto);

            pedido.adicionarItem(itemPedido);

        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(pedido);

        sc.close();
    }
}
