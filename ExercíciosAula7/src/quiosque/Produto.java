/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Produto {
    private int cod;
    private String descricao;
    private double precoCusto;

    public Produto() {
    }

    public Produto(int cod, String descricao, double precoCusto) {
        this.cod = cod;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" + "cod=" + cod + ", descricao=" + descricao + ", precoCusto=" + precoCusto + '}';
    }

    public double retornaPreco(){
        return precoCusto * 1.5;
    }
    
    
}
