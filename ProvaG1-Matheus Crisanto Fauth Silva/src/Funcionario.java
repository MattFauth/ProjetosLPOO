/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Funcionario {
    protected int cod;
    protected String nome;
    protected double salarioB;
    
    public Funcionario(int cod, String nome, double salarioB){
        this.cod=cod;
        this.nome=nome;
        this.salarioB=salarioB;
    }
    
    public Funcionario(){
        
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salarioB
     */
    public double getSalarioB() {
        return salarioB;
    }

    /**
     * @param salarioB the salarioB to set
     */
    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }
    
    public double calcularBonus(){
        return salarioB*1.1;
    }
    public double calcIR(){
        return (calcularBonus())-((calcularBonus())*0.15);
    }
    public String verInformacoes(){
        return getClass().getSimpleName()+" Codigo: "+ getCod()+" Nome: "+getNome()+" Salario Bruto: " + getSalarioB();
    }
    @Override
   public String toString(){
       return "Funcionario{" + "codigo="+getCod()+"nome="+getNome()+"salario bruto="+getSalarioB()+'}';
   }
}
