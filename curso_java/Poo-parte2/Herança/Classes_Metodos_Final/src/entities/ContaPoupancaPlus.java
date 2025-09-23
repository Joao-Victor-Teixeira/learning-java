package entities;

public class ContaPoupancaPlus extends ContaPoupanca {
    // Não pode ser herdada pois ContaPouoanca é uma classe FINAL.


    // O metodo não pode ser sobreposto pois é um metodo FINAL
      @Override
    public  void saque(double quantia) {
        saldo -= quantia +2;
    }
}
 