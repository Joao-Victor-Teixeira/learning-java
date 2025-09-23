import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
       
        LocalDate d01 = LocalDate.parse("2025-09-20");
        LocalDateTime d02 = LocalDateTime.parse("2025-09-20T01:30:27");
        Instant d03 = Instant.parse("2025-09-20T01:30:27Z");

        //Criando um novo LocalDate de uma semana atras

        LocalDate semanaPassada = d01.minusDays(7);
        LocalDate semanaQueVem = d01.plusDays(7);

        System.out.println("Sema passada = " + semanaPassada);
        System.out.println("Semana que vem = " + semanaQueVem);
        System.out.println("------------------");

        LocalDateTime semanaPassada2 = d02.minusDays(7);
        LocalDateTime semanaQueVem2 = d02.plusDays(7);
        LocalDateTime proximaHora = d02.plusHours(1);

        System.out.println("Semana passada = " + semanaPassada2);
        System.out.println("Semana que vem = " + semanaQueVem2);
        System.out.println("Próxima hora = " + proximaHora);
        System.out.println("------------------");

        Instant semanaPassada3 = d03.minus(7, ChronoUnit.DAYS);
        Instant semanaQueVem3 = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana passada = " + semanaPassada3);
        System.out.println("Semana que vem = " + semanaQueVem3);

        // Calculando a duraçao entre uma Data-Hora e outra

        Duration t1 = Duration.between(semanaPassada.atStartOfDay(), d01.atStartOfDay());// Coverção para Data-Hora Global
        System.out.println("t1 dia = " + t1.toDays());
        System.out.println("------------------");
        
        Duration t2 = Duration.between(semanaPassada2, d02);
        System.out.println("t2 dias =" + t2.toDays());
        System.out.println("------------------");
        
        Duration t3 = Duration.between(semanaPassada3, d03);
        System.out.println("t3 = " + t3.toDays());
        System.out.println("------------------");

        Duration t4 = Duration.between(d03, semanaPassada3); // Ordem dos argumentos inversa
        System.out.println("t4 = " + t4.toDays());
        System.out.println("------------------");
    }
}
