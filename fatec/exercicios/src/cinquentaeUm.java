import java.util.Scanner;

public class cinquentaeUm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double notasUm[] = new double[5];
        double notasDois[] = new double[5];
        double media[] = new double[5];

        for (int i = 0; i < notasUm.length; i++) {
            System.out.printf("1º nota do %dº aluno: ", i + 1);
            notasUm[i] = leitor.nextDouble();
        }

        for (int i = 0; i < notasDois.length; i++) {
            System.out.printf("2º nota do %dº aluno: ", i + 1);
            notasDois[i] = leitor.nextDouble();
        }

        for (int i = 0; i < media.length; i++) {
            media[i] = (notasUm[i] + notasDois[i]) / 2;
            /* System.out.println("Media do " + (i + 1) + "º aluno: " + media); */
            System.out.println((i + 1) + (" = ") + media[i]);
        }

    }
}

/* 51.

Fazer um
procedimento para
receber as
notas da
primeira e
da segunda
prova de
cinco alunos.
Armazenar as
notas da
primeira e
da segunda
prova em
vetores distintos.
Calcular e
escrever a
média de
cada aluno
. */