package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.DominioException;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{ 
            System.out.print("Número do quarto: ");
            int numero = sc.nextInt();
            System.out.print("Check-in data (DIA/MES/ANO): ");
            LocalDate checkIn = LocalDate.parse(sc.next(),fmt);
            System.out.print("Check-out data (DIA/MES,ANO): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), fmt);


            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira os dados para atualizar a reserva: ");
            System.out.print("Check-in data (DIA/MES/ANO): ");
            checkIn = LocalDate.parse(sc.next(),fmt);
            System.out.print("Check-out data (DIA/MES,ANO): ");
            checkOut = LocalDate.parse(sc.next(), fmt);

            reserva.atualizarData(checkIn, checkOut);    
            System.out.println("Reserva" + reserva);
        }     
        catch(DominioException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        sc.close();
    }
}