package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();    
        Set<Integer> c = new TreeSet<>();
        Set<Integer> tot = new TreeSet<>();
        
        System.out.print("Quantos alunos estão no curso A: ");
        int na = sc.nextInt();
        
        for (int i = 0; i < na; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("Quantos alunos estão no curso B: ");
        int nb = sc.nextInt();

        for (int i = 0; i < nb; i++) {
            int number = sc.nextInt();
            b.add(number);
        }
        
        System.out.print("Quantos alunos estão no curso C: ");
        int nc = sc.nextInt();

        for (int i = 0; i < nc; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        a.addAll(b);
        a.addAll(c);
        tot.addAll(a);
        
        System.out.println("Total de estudantes: " + tot.size());
        sc.close();
    }
}
