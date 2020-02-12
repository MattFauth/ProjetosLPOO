/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Venda {
    private int cod;
    private Clientes cliente;
    private Quadros quadro;
    
    public Venda(){
        
    }

    public Venda(int cod, Clientes cliente, Quadros quadro) {
        this.cod = cod;
        this.cliente = cliente;
        this.quadro = quadro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Quadros getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadros quadro) {
        this.quadro = quadro;
    }

    @Override
    public String toString() {
        return "Venda{" + "cod=" + cod + ", cliente=" + cliente + ", quadro=" + quadro + '}';
    }
    
    
}
