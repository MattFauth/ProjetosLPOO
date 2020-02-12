/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoLPOO;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Transacoes {
    protected String data;
    protected String hora;
    protected double valor;
    protected double saldoAnterior;
    protected double saldoNovo;
        
    public Transacoes(){
    }

    public Transacoes(String data, String hora, double valor, double saldoAnterior, double saldoNovo) {
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.saldoAnterior = saldoAnterior;
        this.saldoNovo = saldoNovo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getSaldoNovo() {
        return saldoNovo;
    }

    public void setSaldoNovo(double saldoNovo) {
        this.saldoNovo = saldoNovo;
    }

    @Override
    public String toString() {
        return "Transacoes{" + "data=" + data + ", hora=" + hora + ", valor=" + valor + ", saldoAnterior=" + saldoAnterior + ", saldoNovo=" + saldoNovo + '}';
    }
    
}
