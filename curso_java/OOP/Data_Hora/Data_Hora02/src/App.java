import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate d01 = LocalDate.parse("2025-09-20");
        LocalDateTime d02 = LocalDateTime.parse("2025-09-20T01:30:27");
        Instant d03 = Instant.parse("2025-09-20T01:30:28Z");
        

       DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
       // Customizar usando o fuso horario do proprio Computador 
       DateTimeFormatter fmt3= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
       // No lugar de usar todos os parametros podemos simplificar 
       DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
       DateTimeFormatter fmt5 =DateTimeFormatter.ISO_INSTANT;

       // Formas de imprimir data hora customizada 
       System.out.println("d01 = " + d01.format(fmt1));
       System.out.println("d01 = " + fmt1.format(d01));
       System.out.println("d01 = "+ d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       System.out.println("--------------------------");
       System.out.println();

       System.out.println("d02 = " + d02.format(fmt2));
       System.out.println("--------------------------");
       System.out.println();
       
       System.out.println("d03 = " + fmt3.format(d03));
       System.out.println("d03 = " + fmt5.format(d03));
       System.out.println("--------------------------");
       System.out.println();

       System.out.println("d02 = " + fmt4.format(d02));
    }
}
