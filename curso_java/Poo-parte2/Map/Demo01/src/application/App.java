package application;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria"); // Adiciona Chave e Valor ao MAP
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email"); // Remove Chave e valor do Map
        cookies.put("phone", "99711123");// Como a Chave já existe, substitui a antiga pela nova

        System.out.println("Contém a chave 'phone'? " + cookies.containsKey("phone")); // Testa se a chave está contida no Map
        System.out.println("Número de telefone: " + cookies.get("phone")); // Retorna o valor da Chave
        System.out.println("Email: " + cookies.get("email")); // Como foi removido retorna o valor NULL
        System.out.println("Tamanho do MAP: " + cookies.size() );

        System.out.println();
        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) { //Para printar os Elementos contidos no MAP
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
