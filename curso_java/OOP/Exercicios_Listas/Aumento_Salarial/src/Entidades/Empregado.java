package Entidades;

public class Empregado {
    
    private Integer id;
    private String nome;
    private Double salario;
    
    // Construtor com todos os parametros obrigatorios 
    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }
 
    // Metodo para aumentar salario 
    public void aumentarSalario(double porcentagem){
        this.salario += this.salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return   id + ", "+  nome + ", "  + String.format("%.2f", salario) + "." ;
    }
  
}
