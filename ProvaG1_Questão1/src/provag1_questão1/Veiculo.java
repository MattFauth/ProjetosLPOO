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
public class Veiculo {
    protected String cod, placa, marca, modelo, ano;
    protected boolean vendido;
    protected double valorDoBem;

    public Veiculo() {
    }

    public Veiculo(String cod, String placa, String marca, String modelo, String ano, boolean vendido, double valorDoBem) {
        this.cod = cod;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.vendido = vendido;
        this.valorDoBem = valorDoBem;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public double getValorDoBem() {
        return valorDoBem;
    }

    public void setValorDoBem(double valorDoBem) {
        this.valorDoBem = valorDoBem;
    }
    
    public double calculaValor(){
        return valorDoBem;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "cod=" + cod + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", vendido=" + vendido + ", valorDoBem=" + valorDoBem;
    }
    
    
}
