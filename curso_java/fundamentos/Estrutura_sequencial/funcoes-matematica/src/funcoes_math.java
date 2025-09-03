public class funcoes_math {

    public static void main(String[] args){

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y); 
        C = Math.sqrt(25.0); 
        System.out.println("RAÍZES QUADRADAS:");
        System.out.printf("Raiz quadrada de %.3f = %.3f %n",x,A);
        System.out.printf("Raiz quadrada de %.3f = %.3f %n", y,B);
        System.out.printf("Raiz quadrada de 25 = %.2f %n", C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println("POTENCIAÇÃO:");
        System.out.printf("%.0f elevado a %.0f = %.0f %n", x , y , A);
        System.out.printf("%.0f elevado ao quadrado = %.0f %n", x, B);
        System.out.printf("5 elevado ao quadrado = %.0f %n", C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("VALORES ABSOLUTOS:");
        System.out.printf("Valor absoluto de %f = %.0f %n",y ,A);
        System.out.printf("Valor absoluto de %f = %.0f ",z , B);



    }
}
