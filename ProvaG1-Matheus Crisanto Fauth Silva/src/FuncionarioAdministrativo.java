/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class FuncionarioAdministrativo extends Funcionario {
    private String setor;
    
    public FuncionarioAdministrativo(){
        
    }
    public FuncionarioAdministrativo (int cod, String nome, double salarioB, String setor){
        super(cod, nome, salarioB);
        this.setor=setor;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
   public double addDinheiroAdm(){
       return super.calcIR()+1000;
   }
   public String verInformacoes(){
        return super.verInformacoes()+" Setor: " +getSetor();
    }
    public String toString(){
        return super.toString()+"setor="+getSetor();
    }
}
