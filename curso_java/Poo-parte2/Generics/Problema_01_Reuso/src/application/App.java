package application;

import java.util.Scanner;

import services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> prt = new PrintService<>();

        System.out.print("Digite quantos valores ");
        int n = sc.nextInt();

        //prt.addValue("Maria"); Garante a segurança de tipos, não aceita Strings nesse caso

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            prt.addValue(value);
        }

        prt.print();
        Integer x = prt.first();
        System.out.println("Primeiro valor digitado: " + x);
        sc.close();
    }
}
