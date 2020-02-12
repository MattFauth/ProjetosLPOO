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
public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado, String cor) {
        super(cor);
        this.lado = lado;
    }

    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerimetro(){
        return lado*4;
    }
    
    public String verInformacoes(){
        return super.verInformacoes() +" Perimêtro: " + calculaPerimetro() +
                " Área: " + calculaArea();
    }
    
    @Override
    public String toString() {
        return super.toString() + "Quadrado{" + "lado=" + lado + '}';
    }
   
    
}
