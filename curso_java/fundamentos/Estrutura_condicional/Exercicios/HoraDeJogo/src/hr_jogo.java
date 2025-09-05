import java.util.Scanner;

public class hr_jogo {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int hr_inic, hr_final, duracao ;

        System.out.println("Digite a hora INICIAL e FINAL para saber a duração:");
        hr_inic = sc.nextInt();
        hr_final= sc.nextInt();

        if (hr_inic < hr_final) {
            duracao = hr_final - hr_inic;
        }
        else{
            duracao = 24 - hr_inic + hr_final;
        }
        
        System.out.printf("O jogo durou %d Horas", duracao);
        sc.close();

    }
}
