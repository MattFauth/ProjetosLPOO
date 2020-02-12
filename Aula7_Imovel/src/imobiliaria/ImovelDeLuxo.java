
package imobiliaria;

/**
 *
 * @author Madianita
 */
public class ImovelDeLuxo extends Imovel{
    private double adicional;
    
    public ImovelDeLuxo() {
    }

    public ImovelDeLuxo(int cod, String endereço, double tamanho, double adicional) {
        super(cod, endereço, tamanho);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double calculaValor(){
         System.out.println("Médoto 2");
        //Adicional é um % de aumento no valor do imóvel                
        return super.calculaValor()*adicional/100;
    }

    @Override
    public String toString() {
        return super.toString() + "ImovelDeLuxo{" + "adicional=" + adicional + '}';
    }
    
    
}
