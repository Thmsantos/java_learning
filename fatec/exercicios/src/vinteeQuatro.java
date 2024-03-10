import java.util.Scanner;

public class vinteeQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero, resto;

        System.out.print("Numero: ");
        numero = leitor.nextInt();

        resto = numero % 2;

        if (resto == 0) {
            System.out.printf("%d é par!", numero);
        } else {
            {
                System.out.printf("%d é impar!", numero);
            }
        }
    }
}

/* 24.

Faça um
programa na
Linguagem 
Java que
efetue a
leitura de
um número
inteiro e
apresentar uma
mensagem informando
se o
número é
par ou ímpar
. */