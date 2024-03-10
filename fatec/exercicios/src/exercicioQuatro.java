import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int F, C;

        System.out.print("Temperatura em celsius: ");
        C = leitor.nextInt();

        F = (9 * C + 160) / 5;

        System.out.printf("%d celsius = %d fahrenheit" ,C , F);
    }
}

//04. Faça um programa na Linguagem Java que leia uma temperatura em 
//graus Celsius e apresentá-la convertida em graus Fahrenheit.
//A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em 
//Fahrenheit e C a temperatura em Celsius.
