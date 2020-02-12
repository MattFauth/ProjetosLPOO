/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reforco_aulapreg2;

/**
 *
 * @author mathe
 */
public class Imovel {
    private String endereco;
    private int cod;
    private int metragem;
    private int numero;
    private String corretor;
    
    public Imovel(){
        
    }
    
    public Imovel(String endereco, int cod, int metragem, int numero, String corretor) {
        this.endereco = endereco;
        this.cod = cod;
        this.metragem = metragem;
        this.numero = numero;
        this.corretor = corretor;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
     * @return the metragem
     */
    public int getMetragem() {
        return metragem;
    }

    /**
     * @param metragem the metragem to set
     */
    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the corretor
     */
    public String getCorretor() {
        return corretor;
    }

    /**
     * @param corretor the corretor to set
     */
    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + ", cod=" + cod + ", metragem=" + metragem + ", numero=" + numero + ", corretor=" + corretor + '}';
    }
    
}
