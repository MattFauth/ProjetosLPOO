/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Matricula {
    private Aluno aluno;
    private Turma turma;
    private String data;

    public Matricula() {
    }

    public Matricula(Aluno aluno, Turma turma, String data) {
        this.aluno = aluno;
        this.turma = turma;
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Matricula{" + "aluno=" + aluno.getNome() + ", turma=" + turma + ", data=" + data + '}';
    }
    
    
    
}
