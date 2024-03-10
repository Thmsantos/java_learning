import java.util.Scanner;

public class exercicioTreze {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int numero, resto;

        System.out.print("numero: ");
        numero = leitor.nextInt();

        resto = numero % 6;

        System.out.printf("Resto de %d / 6 = %d", numero, resto);
    }
}

/* 13.	Faça um programa na Linguagem Java que receba um número e mostre o resto da divisão por 6. */
