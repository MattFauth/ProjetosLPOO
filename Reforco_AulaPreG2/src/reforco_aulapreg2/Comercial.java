/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reforco_aulapreg2;

/**
 *
 * @author mathe
 */
public class Comercial extends Imovel {
    
    private String categoria;
    private int valor_base;
    
    public Comercial(String categoria, int valor_base) {
        this.categoria = categoria;
        this.valor_base = valor_base;
    }

    public Comercial(String categoria, int valor_base, String endereco, int cod, int metragem, int numero, String corretor) {
        super(endereco, cod, metragem, numero, corretor);
        this.categoria = categoria;
        this.valor_base = valor_base;
    }
    
    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the valor_base
     */
    public int getValor_base() {
        return valor_base;
    }

    /**
     * @param valor_base the valor_base to set
     */
    public void setValor_base(int valor_base) {
        this.valor_base = valor_base;
    }

    @Override
    public String toString() {
        return "Comercial{" + "categoria=" + categoria + ", valor_base=" + valor_base + '}';
    }
    
    
}
