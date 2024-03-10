import java.util.Scanner;

public class exercicioOito {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double raio, area;

        System.out.print("Raio: ");
        raio = leitor.nextDouble();

        area = 3.14 * (raio * raio);

        System.out.println("Area: " + area);

    }
}
