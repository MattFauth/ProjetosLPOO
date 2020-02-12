/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author mathe
 */
public class Trupe {
    protected int cod;
    protected String data;
    protected String  nomeEvento;
    protected String nomeCliente;
    protected String telefone;
    protected double taxaTransporte;
    
    public Trupe(){
        
    }
    public Trupe(int cod, String data, String  nomeEvento, String nomeCliente, String telefone, double taxaTransporte){
        this.cod=cod;
        this.data=data;
        this.nomeEvento=nomeEvento;
        this.nomeCliente=nomeCliente;
        this.telefone=telefone;
        this.taxaTransporte=taxaTransporte;
    }
    /**
     * @return the valorBase
     */

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
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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

    /**
     * @return the taxaTransporte
     */
    public double getTaxaTransporte() {
        return taxaTransporte;
    }

    /**
     * @param taxaTransporte the taxaTransporte to set
     */
    public void setTaxaTransporte(double taxaTransporte) {
        this.taxaTransporte = taxaTransporte;
    }
    public double calcula(){
        return taxaTransporte+250;
    }

}
