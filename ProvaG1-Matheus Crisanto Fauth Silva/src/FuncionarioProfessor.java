/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class FuncionarioProfessor extends Funcionario {
    
    public FuncionarioProfessor(){
        
    }
    public FuncionarioProfessor(int cod, String nome, double salarioB){
        super(cod,nome,salarioB);
    }
    public String verInformacoes(){
        return super.verInformacoes();
    }
    public String toString(){
        return super.verInformacoes();
    }
}
