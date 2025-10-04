package devices;

public class Printer extends Device {
     
    public Printer(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Impressora processando: " + doc);
    }

    public void print(String doc){
        System.out.println("Impressão: " + doc);
    }
}
