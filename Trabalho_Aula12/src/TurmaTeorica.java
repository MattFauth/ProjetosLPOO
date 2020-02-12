/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class TurmaTeorica extends Turma{
    private int numSala;

    public TurmaTeorica() {
    }

    public TurmaTeorica(int num, String semestre, String horario, int qtTotalVagas, int qtAlunosMat, Disciplina disciplina, Professor professor, int numSala) {
        super(num, semestre, horario, qtTotalVagas, qtAlunosMat, disciplina, professor);
        this.numSala = numSala;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    @Override
    public String toString() {
        return "TurmaTeorica{" + "num=" + getNum()
                + ", semestre=" + getSemestre()
                + ", horario=" + getHorario()
                + ", qtTotalVagas=" + getQtTotalVagas()
                + ", qtAlunosMat=" + getQtAlunosMat()
                + ", disciplina=" + getDisciplina().getNome() 
                + ", professor=" + getProfessor().getNome()                
                + "numSala=" + numSala + '}';
    }
    
    
    
}
