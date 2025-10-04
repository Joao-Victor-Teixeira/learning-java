package devices;

public class ConcreteScaner extends Device implements Scaner {

    public ConcreteScaner(String serialNumber){
        super(serialNumber);
    }
        

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner prcessando: " + doc);    
    }

    @Override
    public String scan(){
        return "Conteúdo digitalizado";
    }
     
}
