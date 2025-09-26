package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    
    private Integer numeroQuarto;
    private LocalDate checkIn;
    private LocalDate cehckOut;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate cehckOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.cehckOut = cehckOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCehckOut() {
        return cehckOut;
    }

    public long duracao(){
       return ChronoUnit.DAYS.between(checkIn, cehckOut);   
    }

    public String atualizarData (LocalDate checkIn, LocalDate checkOut) {
         LocalDate agora =  LocalDate.now();
         if (checkIn.isBefore(agora) || checkOut.isBefore(agora) ) {
            return "Erro na reserva: As datas de reserva para atualização devem ser datas futuras.";
        }
        if (!checkIn.isAfter(checkOut)) {
           return "ERRO NA RESERVA: A data de check-out deve ser após a data de check-in.";
        }
        this.checkIn = checkIn;
        this.cehckOut = checkOut;
        return null;
    }

    @Override
    public String toString(){
        return "Quarto"
        + numeroQuarto
        + ", check-in: "
        +checkIn.format(fmt)
        + ", check-out: "
        + cehckOut.format(fmt)
        +", "
        + duracao()
        + " noites";
        
    }
}
