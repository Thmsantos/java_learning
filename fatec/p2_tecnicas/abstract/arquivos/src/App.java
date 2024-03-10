public class App {
    public static void main(String[] args) throws Exception {
        circulo c1 = new circulo(5.00, "rosa");
        quadrado q1 = new quadrado(3.00, "roxo");
        retangulo r1 = new retangulo(2.00, 5.00, "verde");
        triangulo t1 = new triangulo(3.00, 4.00, "azul");

        System.out.println(c1.toString());
        System.out.println(q1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());
    }
}
