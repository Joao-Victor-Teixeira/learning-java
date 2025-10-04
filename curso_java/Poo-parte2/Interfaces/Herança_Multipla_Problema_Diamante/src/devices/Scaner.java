package devices;

public class Scaner extends Device {

    public Scaner(String serialNumber){
        super(serialNumber);
    }
        

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner prcessando: " + doc);    
    }

    public String scan(){
        return "Conteúdo digitalizado";
    }
     
}
