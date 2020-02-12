/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Quadros {
    private int cod;
    private String titulo;
    private String situacao;
    private double valor;
    
    Quadros(){
        
    }

    public Quadros(int cod, String titulo, String situacao, double valor) {
        this.cod = cod;
        this.titulo = titulo;
        this.situacao = situacao;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public String getSituacao() {
        return titulo;
    }

    public void setSituacao(String situacao) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Quadros{" + "cod=" + cod + ", titulo=" + titulo + ", situacao=" + getSituacao() + ", valor=" + valor + '}';
    }
    
}
