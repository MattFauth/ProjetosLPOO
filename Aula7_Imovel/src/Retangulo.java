/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Retangulo extends FiguraGeometrica {
    private double ladoMenor;
    private double ladoMaior;
    /**
     * @return the ladoMenor
     */
    public double getLadoMenor() {
        return ladoMenor;
    }

    /**
     * @param ladoMenor the ladoMenor to set
     */
    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    /**
     * @return the ladoMaior
     */
    public double getLadoMaior() {
        return ladoMaior;
    }

    /**
     * @param ladoMaior the ladoMaior to set
     */
    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }
    public double Area(){
        return ladoMaior*ladoMenor;
    }
    public double Perimetro(){
        return ladoMenor*2+ladoMaior*2;
    }
}
