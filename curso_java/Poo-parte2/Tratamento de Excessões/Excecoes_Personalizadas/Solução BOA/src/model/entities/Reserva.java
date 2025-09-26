package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DominioException;

public class Reserva {
    
    private Integer numeroQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut; 

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate checkOut) throws DominioException {
 
        if (!checkOut.isAfter(checkIn)) {
            throw new DominioException("ERRO NA RESERVA: A data de check-out deve ser após a data de check-in.");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut; 
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

    public LocalDate getCheckOut() { 
        return checkOut;
    }

    public long duracao(){
       return ChronoUnit.DAYS.between(checkIn, checkOut); 
    }

    public void atualizarData(LocalDate checkIn, LocalDate checkOut)throws DominioException {
        LocalDate agora = LocalDate.now(); 
        
        if (checkIn.isBefore(agora) || checkOut.isBefore(agora)) {
            throw new DominioException("Erro na atualização: As datas da reserva devem ser futuras.");
        }
        if (!checkOut.isAfter(checkIn)) { 
            throw new DominioException("Erro na atualização: A data de check-out deve ser após a data de check-in.");
        }
        
        this.checkIn = checkIn;
        this.checkOut = checkOut; 
    }

    @Override
    public String toString(){
        return "Quarto "
        + numeroQuarto
        + ", check-in: "
        + checkIn.format(fmt)
        + ", check-out: "
        + checkOut.format(fmt) 
        + ", "
        + duracao()
        + " noites";
    }
}