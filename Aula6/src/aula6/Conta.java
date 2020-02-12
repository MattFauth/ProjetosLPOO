/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author mathe
 */
public class Conta {
    private int mes;
    private int ano;
    private double qtKWgasto;
    private double ValorKw;

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the qtKWgasto
     */
    public double getQtKWgasto() {
        return qtKWgasto;
    }

    /**
     * @param qtKWgasto the qtKWgasto to set
     */
    public void setQtKWgasto(double qtKWgasto) {
        this.qtKWgasto = qtKWgasto;
    }

    /**
     * @return the ValorKw
     */
    public double getValorKw() {
        return ValorKw;
    }

    /**
     * @param ValorKw the ValorKw to set
     */
    public void setValorKw(double ValorKw) {
        this.ValorKw = ValorKw;
    }
    public double calculaValor(){
         return  qtKWgasto * ValorKw; 
         
    }
    public String imprimeMesValoConta(){
        return "Mes: " + mes + "Ano: " + ano + " Valor da Conta: " + calculaValor();
    }
    @Override
    public String toString(){
        return("Mes: " + mes + " Ano: " + ano + " Valor da conta:" + calculaValor());
    }
}