/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoLPOO;

/**
 *
 * @author mathe
 */
public class Cliente {
    private int cod;
    private String nome;
    private String cpf;
    private String dataCadastro;
    
    public Cliente(){
    }

    public Cliente(int cod, String nome, String cpf, String dataCadastro) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod=" + cod + ", nome=" + nome + ", cpf=" + cpf + ", dataCadastro=" + dataCadastro + '}';
    }
    
}
