public class quadrado extends retangulo {
    private double lado;

    public quadrado(double lado, String cor){
        super(lado, lado, cor);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public String toString(){
        return "lados, area e cor: " + getLado() + area() + getCor();
    }
}
