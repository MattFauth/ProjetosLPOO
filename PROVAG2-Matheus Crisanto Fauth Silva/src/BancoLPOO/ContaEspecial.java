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
public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(){
        
    }
    
    public ContaEspecial(int numConta, Cliente cliente, Double saldo, String dataCriacao, ArrayList<Transacao> Transacoes, double limite){
        super(numConta, cliente, saldo, dataCriacao, Transacoes);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public boolean limite(double limite){
        if(saldo < limite){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "limite=" + limite + '}';
    }
    
}
