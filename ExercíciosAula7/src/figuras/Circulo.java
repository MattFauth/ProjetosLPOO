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
public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo() {
    }    
    
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea(){
        return 3.141592 * Math.pow(raio, 2);
    }
    
    public double calculaPerimetro(){
        return 2 * 3.141592 * raio;
    }
    @Override
    public String verInformacoes(){
        return super.verInformacoes() +" Perimêtro: " + calculaPerimetro() +
                " Área: " + calculaArea();
    }    
    
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "raio=" + raio + '}';
    }
      
}
