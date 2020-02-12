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
public class Curso {
    private int codigo;
    private String titulo;
    private Ministrante ministrante;
    private int qtVagas;

    public Curso() {
    }

    public Curso(int codigo, String titulo, Ministrante ministrante, int qtVagas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ministrante = ministrante;
        this.qtVagas = qtVagas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Ministrante getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Ministrante ministrante) {
        this.ministrante = ministrante;
    }

    public int getQtVagas() {
        return qtVagas;
    }

    public void setQtVagas(int qtVagas) {
        this.qtVagas = qtVagas;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", titulo=" + titulo + ", ministrante=" + ministrante + ", qtVagas=" + qtVagas + '}';
    }

    public double calcularValor(){
        return 10000/qtVagas;
    }
}
