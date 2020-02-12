/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reforco_aulapreg2;

/**
 *
 * @author mathe
 */
public class Corretores {
    
    private int cod;
    private String nome;
    private String telefone;
    
    public Corretores(){
        
    }
    
    public Corretores(int cod, String nome, String telefone) {
        this.cod = cod;
        this.nome = nome;
        this.telefone = telefone;
    }
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Corretores{" + "cod=" + cod + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
}
