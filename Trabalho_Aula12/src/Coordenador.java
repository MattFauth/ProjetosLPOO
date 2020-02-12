/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Coordenador extends Professor{
    private double gratificacao;

    public Coordenador() {
    }

    public Coordenador(int cgu, String nome, Curso curso, double chSem, double gratificacao) {
        super(cgu, nome, curso, chSem);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return "Coordenador{" + "cgu=" + getCgu() + ", nome=" + getNome() + ", curso=" + getCurso().getNome() + "chSem=" + getChSem() + "gratificacao=" + gratificacao + '}';
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario()+gratificacao;
    }    
    
}
