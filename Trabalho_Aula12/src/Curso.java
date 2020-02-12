/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Curso {
    private int cod;
    private String nome;
    private double valorCred;
    private AreaDoConhecimento areaConhecimento;

    public Curso() {
    }

    public Curso(int cod, String nome, double valorCred, AreaDoConhecimento areaConhecimento) {
        this.cod = cod;
        this.nome = nome;
        this.valorCred = valorCred;
        this.areaConhecimento = areaConhecimento;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCred() {
        return valorCred;
    }

    public void setValorCred(double valorCred) {
        this.valorCred = valorCred;
    }

    public AreaDoConhecimento getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaDoConhecimento areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod=" + cod + ", nome=" + nome + ", valorCred=" + valorCred + ", areaConhecimento=" + areaConhecimento + '}';
    }
    
    
}
