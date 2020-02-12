/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Clientes {
    private int cod;
    private String nome;
    private String telefone;
    
    public Clientes(){
        
    }

    public Clientes(int cod, String nome, String telefone) {
        this.cod = cod;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cod=" + cod + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
}
