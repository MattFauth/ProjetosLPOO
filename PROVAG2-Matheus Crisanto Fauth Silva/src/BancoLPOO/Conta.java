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
abstract class Conta {
    protected int numConta;
    protected Cliente cliente;
    protected Double saldo;
    protected String dataCriacao;
    protected ArrayList<Transacao> transacao;
    
    public Conta(){
        
    }

    public Conta(int numConta, Cliente cliente, Double saldo, String dataCriacao, ArrayList<Transacao> Transacoes) {
        this.numConta = numConta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        transacao = new ArrayList<Transacao>();
    }
    
    public void addPaciente(Transacao Transacoes){
        transacao.add(transacao);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public ArrayList<Transacao> getTransacao(){
        return transacao;
    }
    
    public void addTransacao(String tipo, String data, String hora, double valor, double saldoAntes, double saldoApos){
        return Transacoes transacao;
    }
    
    public double depositar(double valor){
        return saldo+valor;
    }
    
    public boolean transferir(Conta contaDestino, double valor){
        if(Conta().saldo.getSaldo > valor){
            Conta saldo.setSaldo-valor;
            Conta contaDestino saldo = saldo.getSaldo()+valor;
            return true;
        }
        else{
            return false;
        }
    
    }
    public boolean sacar(double valor){
        if(Conta().saldo.getSaldo > valor){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString() {
return "Conta{" + "num conta=" + numConta + ", cliente=" + cliente + ", saldo=" + saldo + ", dataCriacao=" + dataCriacao + ", transacao=" + transacao + '}';
    }
}
