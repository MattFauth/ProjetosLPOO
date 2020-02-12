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
public class TrupeVIP extends Trupe{
    private int qtHoras;
    public TrupeVIP(){
        
    }
    public TrupeVIP(int cod, String data, String  nomeEvento, String nomeCliente, String telefone, double taxaTransporte, int qtHoras){
        super(cod, data, nomeEvento, nomeCliente, telefone, taxaTransporte);
    }
    /**
     * @return the qtHoras
     */
    public int getQtHoras() {
        return qtHoras;
    }

    /**
     * @param qtHoras the qtHoras to set
     */
    public void setQtHoras(int qtHoras) {
        this.qtHoras = qtHoras;
    }
        public double calcula(){
            return taxaTransporte+(250*getQtHoras());
    }
}
