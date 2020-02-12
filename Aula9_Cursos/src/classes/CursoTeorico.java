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
public class CursoTeorico extends Curso{
    private int numeroSala;

    public CursoTeorico() {
    }

    public CursoTeorico(int codigo, String titulo, Ministrante ministrante, int qtVagas, int numeroSala) {
        super(codigo, titulo, ministrante, qtVagas);
        this.numeroSala = numeroSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    @Override
    public String toString() {
        return super.toString() + "CursoTeorico{" + "numeroSala=" + numeroSala + '}';
    }
    
     @Override
    public double calcularValor(){
        return super.calcularValor() * 1.1;
    }   
    
    
}
