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
public class Carro extends Veiculo {
    protected int qtPortas;

    public Carro() {
    }

    public Carro(int qtPortas, String cod, String placa, String marca, String modelo, String ano, boolean vendido, double valorDoBem) {
        super(cod, placa, marca, modelo, ano, vendido, valorDoBem);
        this.qtPortas = qtPortas;
    }

    public int getQtPortas() {
        return qtPortas;
    }

    public void setQtPortas(int qtPortas) {
        this.qtPortas = qtPortas;
    }
    
    public double calculaValor(){
        return valorDoBem+valorDoBem*0.1;
    }
    @Override
    public String toString() {
        return super.toString()+ "qtPortas=" + qtPortas + "}"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
