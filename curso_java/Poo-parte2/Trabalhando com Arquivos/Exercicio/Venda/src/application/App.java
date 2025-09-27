package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();
        
        System.out.println("Digite o caminho do arquivo: ");
        String arquivoDeOrigemStr = sc.nextLine();

        File arquivoDeOrigem = new File(arquivoDeOrigemStr);
        String pastaDeOrigemStr = arquivoDeOrigem.getParent();
        
        boolean sucesso = new File(pastaDeOrigemStr + "/out").mkdir();
        
        System.out.println("Pasta Criada : " + sucesso);
        
        String arquivoDeDetino = pastaDeOrigemStr + "/out/sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoDeOrigemStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                
                String [] campos = itemCsv.split(",");
                String nome = campos[0];
                double precoUnitario = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produto(nome, precoUnitario, quantidade));
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeDetino))) {
                for (Produto item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f%n ", item.fechamentoPedido()));
                }
            } 
            catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println(arquivoDeDetino +" Criado!");
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
