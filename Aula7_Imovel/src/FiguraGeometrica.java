/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class FiguraGeometrica {
    protected String cor;
    
    public FiguraGeometrica(){
    }
    public FiguraGeometrica(String cor){
        this.cor = cor;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "cor=" + cor + '}';
    }
}