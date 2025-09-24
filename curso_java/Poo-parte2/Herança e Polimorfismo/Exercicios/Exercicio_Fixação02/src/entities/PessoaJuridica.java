package entities;

public class PessoaJuridica extends Contribuinte {
    
    private Integer numeroDeFuncionarios;

    public PessoaJuridica(){ 
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        double impostoCalculado = 0.0;
        if (getNumeroDeFuncionarios() > 10) {
            impostoCalculado = getRendaAnual() * 0.14;
        }
        else {
            impostoCalculado = getRendaAnual() * 0.16;
        } 
        return impostoCalculado;
    }
    
}
