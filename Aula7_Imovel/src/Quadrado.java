/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Quadrado extends FiguraGeometrica {
    private double lado;
    
    public Quadrado(){
}
    public Quadrado(double lado, String cor) {
        super(cor);
        this.lado = lado;
    }
    /**
     * @return the lados
     */
    public double getLados() {
        return lado;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(double lados) {
        this.lado = lados;
    }
    public double area(){
        return lado*lado;
    }
    public double perimetro(){
        return lado*4;
    }
    public String verInformacoes(){
        return getClass()+" Cor: "+ cor+" Perimetro: " + perimetro() + " Area: " + area();
    }
}
