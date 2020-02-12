/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Turma {
    private int num;
    private String semestre, horario;
    private int qtTotalVagas, qtAlunosMat;
    private Disciplina disciplina;
    private Professor professor;

    public Turma() {
    }

    public Turma(int num, String semestre, String horario, int qtTotalVagas, int qtAlunosMat, Disciplina disciplina, Professor professor) {
        this.num = num;
        this.semestre = semestre;
        this.horario = horario;
        this.qtTotalVagas = qtTotalVagas;
        this.qtAlunosMat = qtAlunosMat;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQtTotalVagas() {
        return qtTotalVagas;
    }

    public void setQtTotalVagas(int qtTotalVagas) {
        this.qtTotalVagas = qtTotalVagas;
    }

    public int getQtAlunosMat() {
        return qtAlunosMat;
    }

    public void setQtAlunosMat(int qtAlunosMat) {
        this.qtAlunosMat = qtAlunosMat;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" + "num=" + num + ", semestre=" 
                + semestre + ", horario=" + horario 
                + ", qtTotalVagas=" + qtTotalVagas 
                + ", qtAlunosMat=" + qtAlunosMat 
                + ", disciplina=" + disciplina.getNome() 
                + ", professor=" + professor.getNome() + '}';
    }
    
    
    
    
    
}
