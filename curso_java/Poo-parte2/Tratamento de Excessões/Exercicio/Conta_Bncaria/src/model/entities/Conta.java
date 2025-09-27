package model.entities;

import model.excepitions.DominioException;

public class Conta {
    
    private Integer numeroConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;
    
    public Conta(){
        super();
    }
    
    public Conta(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double quantia){
         saldo += quantia;
    }

    public void saque(double quantia) throws DominioException{
        if (quantia > saldo) {
            throw new DominioException("Saldo insuficiente");
        }
        if (quantia > limiteSaque) {
            throw new DominioException("O valor excede o limite de saque ");
        }
        saldo -= quantia;
    }
 }
