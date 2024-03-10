import java.util.Scanner;

public class cinquentaeQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int arrayUm[] = new int[5];
        int arrayDois[] = new int[5];

        for (int i = 0; i < arrayUm.length; i++) {
            System.out.printf("%dº numero: ", i + 1);
            arrayUm[i] = leitor.nextInt();

            int multiplicador = arrayUm[i] - 1;
            int fatorial = arrayUm[i];

            for (int j = arrayUm[i]; j > 1; j--) {

                fatorial = fatorial * multiplicador;
                multiplicador = multiplicador - 1;
            }

            arrayDois[i] = fatorial;

        }

        for (int i = 0; i < arrayUm.length; i++) {
            System.out.println(arrayUm[i] + " Fatorial -> " + arrayDois[i]);
        }
    }
}

/* 54.

Criar um
vetor A do
tipo inteiro de 5 elementos–
Solicitar os
valores para
o usuário
e inserir
no vetor A–
Criar um
vetor B do
tipo inteiro–
Ler o
vetor A
e para
cada elemento
lido calcular
o fatorial
e gravar
no B–
Após de
todos os elementos do
vetor A, mostrar
os dois
vetores */