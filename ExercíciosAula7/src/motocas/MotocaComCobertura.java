/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocas;

/**
 *
 * @author Madianita
 */
public class MotocaComCobertura extends Motoca{
    private String cor;

    public MotocaComCobertura() {
    }

    public MotocaComCobertura(int codigo, String personagem, String cor) {
        super(codigo, personagem);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor=" + cor;
    }
    
    @Override
    public double precoFinal(){
        return super.precoFinal()*1.2;
    }    

}
