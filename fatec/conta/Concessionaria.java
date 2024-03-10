public class Concessionaria{
    private int ano;
    private String modelo;
    private String marca;

   /*  Concessionaria(int ano, String modelo, String marca){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    } */

    void setAno(int ano) {
        this.ano = ano;
    }

    int getAno(){
        return ano;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    String getMarca(){
        return marca;
    }
}
