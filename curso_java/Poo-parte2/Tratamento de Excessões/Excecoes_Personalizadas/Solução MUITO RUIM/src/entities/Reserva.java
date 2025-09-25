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

    public void atualizarData (LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.cehckOut = checkOut;
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
