/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocas;

/**
 *
 * @author Madianita
 */
public class Motoca {
    protected int codigo;
    protected String personagem;
    protected static double valorBase;
    
    public Motoca(){}
    
    public Motoca(int codigo, String personagem){
        this.codigo = codigo;
        this.personagem = personagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public static double getValorBase() {
        return valorBase;
    }

    public static void setValorBase(double valorBase) {
        Motoca.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Código=" + codigo + ", Personagem=" + personagem;
    }
    
    public double precoFinal(){
        return valorBase;
    }
        
}
