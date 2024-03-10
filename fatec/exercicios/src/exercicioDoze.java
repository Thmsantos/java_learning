import java.util.Scanner;

public class exercicioDoze {
    public static void main(String[] main){
        Scanner leitor = new Scanner(System.in);

        int numero, quadrado;

        System.out.print("Numero: ");
        numero = leitor.nextInt();

        quadrado = numero * numero;

        System.out.printf("%d ao quadrado = %d", numero, quadrado);
    }
}

/* 12.	Faça um programa na Linguagem 
Java para efetuar 
a leitura de um número
inteiro e apresentar o resultado do quadrado desse número. */

