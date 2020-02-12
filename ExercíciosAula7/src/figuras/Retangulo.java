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
public class Retangulo extends FiguraGeometrica{
    private double lado1, lado2;

    public Retangulo() {
    }

    public Retangulo(double lado1, double lado2, String cor) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calculaArea(){
        return lado1*lado2;
    }
    
    public double calculaPerimetro(){
        return lado1*2 + lado2*2;
    }
    
    public String verInformacoes(){
        return super.verInformacoes() +" Perimêtro: " + calculaPerimetro() +
                " Área: " + calculaArea();
    }
    
    @Override
    public String toString() {
        return "Retangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

}
