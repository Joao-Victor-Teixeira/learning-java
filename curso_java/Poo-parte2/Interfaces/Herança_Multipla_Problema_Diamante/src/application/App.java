package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScaner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("*** CLASSE IMPRESSORA ***");
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("Minha carta");
        p.print("Minha carta");
        System.out.println("_______________________");

        System.out.println("*** CLASSE SCANNER ***");
        ConcreteScaner s = new ConcreteScaner("2003");
        s.processDoc("Meu Email");
        System.out.println("Resultado do Scan: "+ s.scan());
        System.out.println("_______________________");

        System.out.println("*** CLASSE COMBO DEVICE COM INTERFACES ***");
        ComboDevice c = new ComboDevice("2091");

        c.processDoc("Minha dissertação ");
        c.print("Minha redação");
        System.out.println("Resultado do Scan: " + c.scan());
    }
}
