import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Para exibir Data de "agora"
        LocalDate d01 = LocalDate.now();
        System.out.println("Data: " + d01);

        // Para exibir Data-[Hora](Local)
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data-[Hora] Local: " + d02);

        // Para exibir Data-Hora com fuso horario 
        Instant d03 =Instant.now();
        System.out.println("Data-Hora Global(com fuso horario): " + d03);

        // Gerando uma Data-[Hora] local a partir de  um texto ISO 8601 
        LocalDate d04 = LocalDate.parse("2025-09-19");
        System.out.println("Data-[Hora] local gerada por ISO 8601: " + d04);

        // Gerando uma Data-Hora customizada a partir de um texto ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2025-09-19T21:20:12");
        System.out.println("Data-Hora customizada gerada por ISO 8601: " + d05);

        // Gerando uma Data-Hora Global (com fuso horario) a partir de um texto ISO 8601
        Instant d06 = Instant.parse("2025-09-19T21:20:12Z");
        System.out.println("Data-Hora Global com fuso horario gerada por ISO 8601: " + d06);

        // Gerando uma Data-Hora com ISO 8601 e o sistema faz o calculo de fuso horario
        Instant d07 = Instant.parse("2025-09-19T21:20:12-03:00");
        System.out.println("Data Hora gerado por Iso 8601 com outro fuso horario: " + d07);

        // Especificando formato Customizado para Datas
        DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Definindo o formato atraves de uma sobrecarga
        LocalDate d08 = LocalDate.parse("19/09/2025", fmt1);
        System.out.println("Data por formato customizado(o output sai em formato ISO 8601): " + d08);

        // Especificando foramto customizado para Data e Hora
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("19/09/2025 01:30", fmt2);
        System.out.println("Data Hora por formato customizado: " + d09);

        // Instanciando Data por dados isolados
        LocalDate d10 = LocalDate.of(2025, 9, 20);
        System.out.println("Instanciando Data por dados isolados: " + d10);

        // Instaciando Data-Hora por dados isolados
        LocalDateTime d11 = LocalDateTime.of(2025, 9, 19, 01, 30, 14);
        System.out.println("Intanciando Data-Hora por dados isolados: " + d11);
    }
}
