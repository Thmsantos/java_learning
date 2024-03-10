import java.util.Scanner;

public class trintaeUm {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int numero, multiplicador;

        System.out.print("numero: ");
        numero = leitor.nextInt();

        int fatorial = numero;

        for(int i = 1; i < numero; i++){
           System.out.println("fat: " + fatorial);
           System.out.println("numero: " + (numero ));
           multiplicador = numero - i;
           fatorial = fatorial * multiplicador;
        }

         System.out.printf("fatorial de %d = %d", numero, fatorial);
    }
}

/* 31. Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número. */