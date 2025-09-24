package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
    

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        double impostoCalculado = 0.0;
        double valorFinal = 0.0;
        if (getRendaAnual() < 20000.0) {
           impostoCalculado = getRendaAnual() * 0.15;
        }
         else { impostoCalculado = getRendaAnual() * 0.25;
        }    
        double abatimento = getGastosSaude() * 0.5;
        valorFinal = impostoCalculado - abatimento;
        
        if (valorFinal < 0) {
            return 0.0;
        }
        else{
            return valorFinal;
        }
    }  
}
