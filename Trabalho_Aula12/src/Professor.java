/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Professor extends Pessoa{
    private double chSem;
    private static double valorHora;

    public Professor() {
    }

    public Professor(int cgu, String nome, Curso curso, double chSem) {
        super(cgu, nome, curso);
        this.chSem = chSem;
    }

    public double getChSem() {
        return chSem;
    }

    public void setChSem(double chSem) {
        this.chSem = chSem;
    }

    public static double getValorHora() {
        return valorHora;
    }

    public static void setValorHora(double valorHora) {
        Professor.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Professor{" + "cgu=" + getCgu() + ", nome=" + getNome() + ", curso=" + getCurso().getNome() + "chSem=" + chSem + '}';
    }
    
    public double calcularSalario(){
        return chSem*4.5*valorHora;
    }
    
}
