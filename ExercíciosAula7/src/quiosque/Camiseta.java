/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Camiseta extends Produto{
    private String tamanho;
    public Camiseta() {
    }

    public Camiseta(int cod, String descricao, double precoCusto, String tamanho) {
        super(cod, descricao, precoCusto);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }    

    @Override
    public String toString() {
        return "Camiseta{" + "tamanho=" + tamanho + '}';
    }
    
    
    @Override
    public double retornaPreco(){
        return super.retornaPreco() * 1.075;
    }    
    
    
}
