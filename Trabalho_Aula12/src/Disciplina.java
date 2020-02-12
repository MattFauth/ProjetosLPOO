/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Disciplina {
    private int cod;
    private String nome;
    private int qtCred;

        public Disciplina() {
    }
    
    public Disciplina(int cod, String nome, int qtCred) {
        this.cod = cod;
        this.nome = nome;
        this.qtCred = qtCred;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtCred() {
        return qtCred;
    }

    public void setQtCred(int qtCred) {
        this.qtCred = qtCred;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "cod=" + cod + ", nome=" + nome + ", qtCred=" + qtCred + '}';
    }
    
    
}
