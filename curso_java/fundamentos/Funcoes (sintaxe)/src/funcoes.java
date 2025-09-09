import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Digite os 3 numeros: ");
        a = sc.nextInt();
        b =sc.nextInt();
        c= sc.nextInt();
        
        int maior = max(a,b,c);
        mostrarResult(maior);

        sc.close();
        
    }

    //Função para encontrar o maior valor entre as 3 variaveis
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else    {
            aux = z;
        }
        return aux;
    }  
    
    //Função para imprimir o resultado na tela
    public static void mostrarResult(int value){
        System.out.println("Maior:  " + value);
    }


}
