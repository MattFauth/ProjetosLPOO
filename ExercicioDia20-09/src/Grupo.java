
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Grupo {

    /**
     * @return the diariaBase
     */
    public static double getDiariaBase() {
        return diariaBase;
    }

    /**
     * @param aDiariaBase the diariaBase to set
     */
    public static void setDiariaBase(double aDiariaBase) {
        diariaBase = aDiariaBase;
    }
    
    private int cod;
    private String nome;
    private int qtDias;
    private ArrayList<Grupo> nomes;
    private static double diariaBase;
    
    public Grupo(){
    }
    
    public Grupo(int cod, String nome, int qtDias, ArrayList nomes){
        this.cod = cod;
        this.nome = nome;
        this.qtDias = qtDias;
        this.nomes = nomes;
        
    }
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtDias
     */
    public int getQtDias() {
        return qtDias;
    }

    /**
     * @param qtDias the qtDias to set
     */
    public void setQtDias(int qtDias) {
        this.qtDias = qtDias;
    }

    /**
     * @return the nomes
     */
    public ArrayList<Grupo> getNomes() {
        return nomes;
    }

    /**
     * @param nomes the nomes to set
     */
    public void setNomes(ArrayList<Grupo> nomes) {
        this.nomes = nomes;
    }
    public double Diaria(){
        double a = qtDias*diariaBase*nomes.size();
        return a;}
public String mostraGrupo(){
    return "Codigo do grupo: " + cod + " Nome do grupo: " + nome + " Quantidade de Dias: " + qtDias + "Nomes das pessoas: " + nomes + " Preco Estadia:" + Diaria();
    }
}