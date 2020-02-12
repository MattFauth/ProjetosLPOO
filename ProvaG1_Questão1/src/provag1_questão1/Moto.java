/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provag1_questão1;

/**
 *
 * @author 126393310
 */
public class Moto extends Veiculo{
    protected double qtCilindradas;

    public Moto() {
    }

    public Moto(double qtCilindradas, String cod, String placa, String marca, String modelo, String ano, boolean vendido, double valorDoBem) {
        super(cod, placa, marca, modelo, ano, vendido, valorDoBem);
        this.qtCilindradas = qtCilindradas;
    }

    public double getQtCilindradas() {
        return qtCilindradas;
    }

    public void setQtCilindradas(double qtCilindradas) {
        this.qtCilindradas = qtCilindradas;
    }
    public double calculaValor(){
        return valorDoBem+100;
    }
    @Override
    public String toString() {
        return super.toString()+"qtCilindradas=" + qtCilindradas + '}'; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
