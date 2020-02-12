/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provag1_questão1;

/**
 *
 * @author 126393310
 */
public class Venda {
    protected String cod;
    protected Cliente cliente;
    protected Veiculo veiculo;

    public Venda() {
    }

    public Venda(String cod, Cliente cliente, Veiculo veiculo) {
        this.cod = cod;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Venda{" + "cod=" + cod + ", cliente=" + cliente + ", veiculo=" + veiculo + '}';
    }
    
    
    
}
