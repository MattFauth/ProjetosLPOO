
package imobiliaria;

/**
 *
 * @author mathe
 */
public class Imovel {
    private int cod;
    private String endereço;
    private double tamanho;
    private static double valorMetro;

    public Imovel() { }

    public Imovel(int cod, String endereço) {
        this.cod = cod;
        this.endereço = endereço;
    }
    
    public Imovel(int cod, String endereço, double tamanho) {
        this.cod = cod;
        this.endereço = endereço;
        this.tamanho = tamanho;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public static double getValorMetro() {
        return valorMetro;
    }

    public static void setValorMetro(double valorMetro) {
        Imovel.valorMetro = valorMetro;
    }
    
    public double calculaValor(){
        System.out.println("Médoto 1");
        return tamanho*valorMetro;
    }    
    

    @Override
    public String toString() {
        return "Imovel{" + "cod=" + cod + ", endereço=" + endereço + ", tamanho=" + tamanho + '}';
    }

    
}
