public class triangulo extends figura {
    private double altura;
    private double base;

    public triangulo(double altura, double base, String cor){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public double getBase() {
        return this.base;
    }

   
    public double getAltura() {
        return this.altura;
    }

    public double area() {
        return base * altura / 2;
    }


    public String toString(){
        return "base, altura, area e cor: " + getBase() + getAltura() + area() + getCor();
    }


}
