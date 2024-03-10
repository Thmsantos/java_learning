public class circulo extends figura {
    private double raio;

    public circulo(double raio, String cor){
        super(cor);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
   
    public double getRaio() {
        return this.raio;
    }
 
    public double area() {
        return 3.14 * (raio * raio);
    }
    
    public double getDiametro() {
        return 2 * raio;
    }

    public String toString(){
        return "raio, diametro, area e cor: " + getRaio() + getDiametro() + area() + getCor(); 
    }
}
