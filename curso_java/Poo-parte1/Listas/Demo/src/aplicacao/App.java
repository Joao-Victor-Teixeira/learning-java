package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");//Sobrecarga pra escolher em qual indice adicionar o elemento
      
        System.out.println(list.size());//Para saber o tamanho da lista 

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------");

       // list.remove("Anna");//Operação para remover dados a partir da comparação de dados
       //list.remove(1);//Operação para remover dados a partir do indice
       list.removeIf(x -> x.charAt(0) == 'M');// Remove elemetos atraves de operção lambda por predicado(Aprofundamento futuro)

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));// Operação para localizar um elemento na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco"));//Se não estiver mais na lista retorna -1

        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
        //Converter para String e depois retornar para lista 
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        // Encontrar o elemento com base no predicado, caso não haja elemento com o predicado retorna nulo
        System.out.println(nome);
    }

}
