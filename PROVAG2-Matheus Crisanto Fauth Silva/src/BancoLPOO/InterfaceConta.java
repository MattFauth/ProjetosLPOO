package BancoLPOO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public interface InterfaceConta {
    public void addTansacao(String tipo, String data, String hora, double alor, double saldoAntes, double saldoApos);
    public void depositar(double valor);
    public boolean transferir(Conta contaDestino, double valor);
    public boolean sacar(double valor);
    
}
