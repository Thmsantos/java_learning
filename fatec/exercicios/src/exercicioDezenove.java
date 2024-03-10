import java.util.Scanner;

public class exercicioDezenove {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double media, acumulador = 0;
        double array[] = new double[4];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            array[i] = leitor.nextDouble();
            acumulador = acumulador + array[i];
        }

        media = acumulador / 4;

        if (media >= 7) {
            System.out.println("Aprovado! Media: " + media);
        } else {
            System.out.println("Não foi aprovado! Media: " + media);
        }

    }
}

/* 19.

Faça um
programa na
Linguagem Java
que leia
quatros valores
referentes a
quatro notas
escolares de
um aluno
e imprimir
uma mensagem
dizendo que
o aluno
foi aprovado, se
o valor
da média escolar for
maior ou
igual a 7.
Se o
aluno não
foi aprovado, indicar
uma mensagem
informando esta
condição.Apresentar junto
das mensagens
o valor
da média do
aluno para
qualquer condição
. */