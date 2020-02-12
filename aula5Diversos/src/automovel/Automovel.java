package automovel;

public class Automovel {
    private String marca, modelo;
    private int ano;
    private boolean ligado = false;
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }
  
    public void ligar() { 
        ligado = true;
    }
    public void desligar() { 
        ligado = false;
    }
    public String verEstado() { 
        if (ligado) return "ligado";
        return "desligado";
    }    
}


