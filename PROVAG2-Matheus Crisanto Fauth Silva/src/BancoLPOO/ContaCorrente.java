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
public class ContaCorrente extends Conta {
    
    public ContaCorrente(){
    }
    public ContaCorrente(int numConta, Cliente cliente, Double saldo, String dataCriacao, ArrayList<Transacao> Transacoes){
        super(numConta, cliente, saldo, dataCriacao, Transacoes);
    }
}
