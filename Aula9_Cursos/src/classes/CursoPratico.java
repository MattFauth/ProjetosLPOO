/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Madianita
 */
public class CursoPratico extends Curso{
    private String nomeLaboratorio;

    public CursoPratico() {
    }

    public CursoPratico(int codigo, String titulo, Ministrante ministrante, int qtVagas, String nomeLaboratorio) {
        super(codigo, titulo, ministrante, qtVagas);
        this.nomeLaboratorio = nomeLaboratorio;
    }   

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    @Override
    public String toString() {
        return super.toString() + "CursoPratico{" + "nomeLaboratorio=" + nomeLaboratorio + '}';
    }
    
    @Override
    public double calcularValor(){
        return super.calcularValor() * 1.2;
    }          
    
}
