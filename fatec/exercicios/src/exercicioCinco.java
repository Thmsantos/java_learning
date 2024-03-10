import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int F, C;

        System.out.print("temperatura em fahrenheit: ");
        F = leitor.nextInt();

        C = (F - 32) * (5/9);

        System.out.printf("%d fahrenheit = %d celsius", F, C);
    }
}


/* 05.	 Faça um programa na Linguagem Java que 
leia uma temperatura em graus Fahrenheit e apresentá-la
 convertida em graus Celsius. A formula de conversão é C
  <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius. */
