import java.util.Scanner;

public class exercicioOnze {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a, b, troca;

        System.out.print("A: ");
        a = leitor.nextInt();

        System.out.print("B: ");
        b = leitor.nextInt();

        System.out.println("a: " + a + " b: " + b);

        troca = b;
        b = a;
        a = troca;

        System.out.println("a: " + a + " b: " + b);
    }
}

/* 11.

Faça um
programa na
Linguagem Java
para ler
dois valores
inteiros para
as variáveis
A e
B e
efetuar a
troca dos
valores de
forma que
a variável
A passe
a possuir
o valor
da variável
B e
a variável
B passe
a possuir
o valor
da variável
A. Apresentar os
valores trocados
. */