public class quarentaeOito {
    public static void main(String[] args) {
        int arrayUm[] = new int[11];
        int arrayDois[] = new int[11];

        for (int i = 1; i < arrayUm.length; i++) {
            arrayUm[i] = i;
            arrayDois[i] = arrayUm[i] * 2;
            System.out.println(arrayUm[i] + " -- " + arrayDois[i]);
        }
    }
}

/* 48.

Criar uma coleção“A”
na linguagem
Java com 10 elementos–
Inserir os
elementos de 1 a 10
na coleção–
Criar uma
outra coleção
B que
conterá o
elemento da
coleção A
multiplicado por 2–
Mostrar as
duas coleçõesObs.
Não efetuar
a leitura de 10
elementos */