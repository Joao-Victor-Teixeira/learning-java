package application;

import devices.Printer;
import devices.Scaner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Printer p = new Printer("1080");
        p.processDoc("Minha carta");
        p.print("Minha carta");

        Scaner s = new Scaner("2003");
        s.processDoc("Meu Email");
        System.out.println("Resultado do Scan: "+ s.scan());
    }
}
