package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet"); // Para remover o obj da coleção
        set.removeIf(x -> x.length() >= 3); // Remove todo elemento que tem mais de 3 caracteres

        for (String p : set) {
            System.out.println(p);
        }
    }
}

// HashSet o mais rápido mas não mantém a ordem
// TreeSet mais lento porém ordena os dados
// LinkedHashSet intermediario e mantém a ordem que os elementos foram inseridos