/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class TurmaPratica extends Turma{
    private String nomeLab;

    public TurmaPratica() {
    }

    public TurmaPratica(int num, String semestre, String horario, int qtTotalVagas, int qtAlunosMat, Disciplina disciplina, Professor professor, String nomeLab) {
        super(num, semestre, horario, qtTotalVagas, qtAlunosMat, disciplina, professor);
        this.nomeLab = nomeLab;
    }

    public String getNomeLab() {
        return nomeLab;
    }

    public void setNomeLab(String nomeLab) {
        this.nomeLab = nomeLab;
    }

    @Override
    public String toString() {
        return "TurmaPratica{" + "num=" + getNum()
                + ", semestre=" + getSemestre()
                + ", horario=" + getHorario()
                + ", qtTotalVagas=" + getQtTotalVagas()
                + ", qtAlunosMat=" + getQtAlunosMat()
                + ", disciplina=" + getDisciplina().getNome() 
                + ", professor=" + getProfessor().getNome()                 
                + "nomeLab=" + nomeLab + '}';
    }
    
    
    
}
