import java.util.Scanner;

public class exercicioSeis {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double raio, altura, volume;

        System.out.print("Raio: ");
        raio = leitor.nextDouble();

        System.out.print("Altura: ");
        altura = leitor.nextDouble();
        
        volume = 3.14159 * (raio * raio) * altura;

        System.out.println("volume da lata: " + volume);

    }
}


/* Faça um programa na Linguagem Java  para calcular e apresentar o valor do
volume de uma lata de óleo, utilizando a f
órmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA. */