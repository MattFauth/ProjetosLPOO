/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Aluno extends Pessoa{
    private String tipoIngresso;
    private int anoIngresso;

    public Aluno() {
    }

    public Aluno(int cgu, String nome, Curso curso, String tipoIngresso, int anoIngresso) {
        super(cgu, nome, curso);
        this.tipoIngresso = tipoIngresso;
        this.anoIngresso = anoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "cgu=" + getCgu() + ", nome=" + getNome() + ", curso=" + getCurso().getNome()+ "tipoIngresso=" + tipoIngresso + ", anoIngresso=" + anoIngresso + '}';
    }
    
    
    
}
