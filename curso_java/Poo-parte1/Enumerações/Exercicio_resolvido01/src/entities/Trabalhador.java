package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities_enum.NivelTrabalhador;

public class Trabalhador {
    
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List <HorasDeContrato> contratos = new ArrayList<>();

    public Trabalhador() {
        
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasDeContrato> getContratos() {
        return contratos;
    }

    public void adicionarContrato(HorasDeContrato contrato){
        contratos.add(contrato);
    }

    public void reomoverContrato(HorasDeContrato contrato){
        contratos.remove(contrato);
    }

    public double ganhos(int ano, int mes){
        double soma = salarioBase;
        for (HorasDeContrato c : contratos) {
            LocalDate dataContrato = c.getData();

            int c_ano = dataContrato.getYear();
            int c_mes = dataContrato.getMonthValue();
            
            if (c_ano == ano && c_mes == mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
