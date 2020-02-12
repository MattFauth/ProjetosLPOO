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
public class Residencial extends Imovel {
    private int qt_quartos;
    private int valor_base;
    
    public Residencial(){
        
    }

    public Residencial(int qt_quartos, int valor_base, String endereco, int cod, int metragem, int numero, String corretor) {
        super(endereco, cod, metragem, numero, corretor);
        this.qt_quartos = qt_quartos;
        this.valor_base = valor_base;
    }

    /**
     * @return the qt_quartos
     */
    public int getQt_quartos() {
        return qt_quartos;
    }

    /**
     * @param qt_quartos the qt_quartos to set
     */
    public void setQt_quartos(int qt_quartos) {
        this.qt_quartos = qt_quartos;
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
        return "Residencial{" + "qt_quartos=" + qt_quartos + ", valor_base=" + valor_base + '}';
    }
    
}
