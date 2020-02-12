/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Madianita
 */
public class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String verInformacoes(){
        return getClass().getSimpleName()+" Cor: "+ getCor();
    }    
    
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "cor=" + cor + '}';
    }
    
    
    
}
