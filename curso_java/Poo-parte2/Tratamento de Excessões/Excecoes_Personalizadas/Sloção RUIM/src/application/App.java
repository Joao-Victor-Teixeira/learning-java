package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Reserva;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numero = sc.nextInt();
        System.out.print("Check-in data (DIA/MES/ANO): ");
        LocalDate checkIn = LocalDate.parse(sc.next(),fmt);
        System.out.print("Check-out data (DIA/MES,ANO): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

        if (!checkOut.isAfter(checkIn)) {
            System.out.println("ERRO NA RESERVA: A data de check-out deve ser após a data de check-in.");
        }
        else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira os dados para atualizar a reserva: ");
            System.out.print("Check-in data (DIA/MES/ANO): ");
            checkIn = LocalDate.parse(sc.next(),fmt);
            System.out.print("Check-out data (DIA/MES,ANO): ");
            checkOut = LocalDate.parse(sc.next(), fmt);


            String erro = reserva.atualizarData(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            }    
            else{
                System.out.println("Reserva" + reserva);
            }
        }
        sc.close();
    }
}