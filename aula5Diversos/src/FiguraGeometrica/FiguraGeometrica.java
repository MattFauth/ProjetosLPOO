/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraGeometrica;

/**
 *
 * @author mathe
 */
public class FiguraGeometrica {
    private double lado1, lado2;
    
    public double getLado1(){
        return lado1;
    }
    
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    
     public double getLado2(){
        return lado2;
    }
    
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public double calcularArea(){
        return lado1*lado2;
    }
}
