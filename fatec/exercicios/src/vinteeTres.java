import java.util.Scanner;

public class vinteeTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int array[] = new int[5];
        int menor, maior;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d° numero: ", i + 1);
            array[i] = leitor.nextInt();
        }

        menor = array[0];
        maior = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }

            if (menor > array[i]) {
                menor = array[i];
            }
        }

        System.out.printf("Maior = %d, Menor = %d", maior, menor);
    }
}

/* 23.

Faça um
programa na
Linguagem Java
que efetue
a leitura
de cinco
números inteiros
e identificar
o maior
e o
menor valor.
Não execute
a ordenação
de valores
. */