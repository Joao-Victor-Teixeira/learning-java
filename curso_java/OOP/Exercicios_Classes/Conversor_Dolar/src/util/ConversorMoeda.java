package util;

public class ConversorMoeda {
        
    public static final double IOF = 0.06;
    public static double conversor( double cotacao, double valorReais){
        double valorBruto = cotacao * valorReais;
        return valorBruto + (valorBruto* IOF);
    }    
}
