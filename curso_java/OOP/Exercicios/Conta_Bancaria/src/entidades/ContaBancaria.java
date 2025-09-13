package entidades;

public class ContaBancaria {
    // Constante da taixa de R$ 5.00 para saques
    public static final double TAXA = 5.00;

    //Atributos da classe ContaBancaria
    private int numeroConta;
   

    private String nome;
    private double saldo;

    
    //Construtor da classe ContaBancaria
    public ContaBancaria(int numeroConta ,String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
   
    // Método que permite acessar o número da conta mas não modificar-lo
     public int getNumeroConta() {
        return numeroConta;
    }

    
    // Método que permite acessar o nome do titular da conta
    public String getNome() {
        return nome;
    }
    // Método que permite modificar o nome do titular caso necessario 
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Método que permite acessar o saldo da conta 
    public double getSaldo() {
        return saldo;
    }

    // Implementação da logica de cadastro
    public void nome(String nome){
        this.nome = nome;
    }

    public int numeroct(int numeroConta){
        return this.numeroConta = numeroConta;
    }


    // Implementação da lógica de saque e deposito

    public double depositar(double deposito){
        return this.saldo += deposito;
    }
    
    public double saque(double saque){
        return this.saldo  -= saque + TAXA;
    }
}

