/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madianita
 */
public class AreaDoConhecimento {
    private int cod;
    private String desc;

    public AreaDoConhecimento() {
    }

    public AreaDoConhecimento(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "AreaDoConhecimento{" + "cod=" + cod + ", desc=" + desc + '}';
    }    
    
}
