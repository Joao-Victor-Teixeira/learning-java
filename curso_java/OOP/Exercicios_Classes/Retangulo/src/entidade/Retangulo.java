package entidade;

public class Retangulo {
    
    public double largura;
    public double altura;

    public double area() {
        return altura * largura;
    }

    public double perimetro () {
        double P = 2 * (altura + largura);
        return P ;
    }

    public double diagonal() {
        double D = Math.sqrt((largura*largura) +(altura * altura));
        return D;
    }

}
