public class retangulo extends figura {
    private double lado1;
    private double lado2;

    public retangulo(double lado1, double lado2, String cor){
        super(cor);
    }

    public void setlado1(double lado1){
        this.lado1 = lado1;
    }

    public void setlado2(double lado2){
        this.lado2 = lado2;
    }

    public double getlado1(){
        return lado1;
    }

    public double getlado2(){
        return lado2;
    }

    public double area(){
        return lado1 * lado2;
    }

    public String toString(){
        return "retangulo de lado um: " + lado1 + " e de lado 2: " + lado2 + " tem area de: " + area();
    }
}
