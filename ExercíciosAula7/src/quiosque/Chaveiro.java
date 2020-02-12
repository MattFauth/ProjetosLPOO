/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class Chaveiro extends Produto{

    public Chaveiro() {
    }

    public Chaveiro(int cod, String descricao,  double precoCusto) {
        super(cod, descricao,  precoCusto);
    }

    @Override
    public double retornaPreco(){
        return super.retornaPreco() * 1.055;
    }

       public String toString(){
        return "Chaveiro:" + super.toString();
    }
    
    
}
