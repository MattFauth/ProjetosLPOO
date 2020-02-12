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
public class MotocaEletrica extends Motoca{
    private int voltagem;

    public MotocaEletrica() {
    }

    public MotocaEletrica(int codigo, String personagem, int voltagem) {
        super(codigo, personagem);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Voltagem=" + voltagem;
    }        
    
    @Override
    public double precoFinal(){
        return super.precoFinal()*1.5;
    }
}
