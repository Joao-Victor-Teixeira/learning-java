import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);  
       
       int mask = 0b00100000;
       int n = sc.nextInt();
       if ((n & mask) != 0) {
        System.out.println("O 6° bit é TRUE (1)");
       } 
       else{
        System.err.println("O 6° bit é FALSE (0).");
       }
       sc.close();
    }
}
