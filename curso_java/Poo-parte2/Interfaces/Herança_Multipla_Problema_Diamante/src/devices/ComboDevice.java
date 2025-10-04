package devices;

public class ComboDevice extends Device implements Scaner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processamento Combo: ");
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    @Override
    public String scan() {
        return "Combo Scan resultado: ";
    }

    @Override
    public void print(String doc) {
          System.out.println("Combo print: " + doc);
    }   
}
