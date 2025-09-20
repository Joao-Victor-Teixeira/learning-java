import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate d01 = LocalDate.parse("2025-09-20");
        LocalDateTime d02 = LocalDateTime.parse("2025-09-20T02:30:27");
        Instant d03 = Instant.parse("2025-09-20T01:30:27Z");

        // Convertento uma Data-hora Global para uma Data-hora Local

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); 
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("------------------");
        System.out.println("r2 = " + r2);
        System.out.println("------------------");
        System.out.println("r3 = " + r3);
        System.out.println("------------------");
        System.out.println("r4 = " + r4);
        System.out.println("------------------");

        // Obtento Data-Hora Local 
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());
        System.out.println("------------------");

        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02  minutos = " + d02.getMinute());
        
        
    }
}
