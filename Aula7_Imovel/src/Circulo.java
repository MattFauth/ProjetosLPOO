/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Circulo extends FiguraGeometrica{
    private double raio;
    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double CalculaArea(){
        return raio*raio*3.14;
    }
    public double CalculaDiametro(){
        return raio*2;
    }
    public double CalculaPerimetro(){
        return 3.14*CalculaDiametro();
    }
}
