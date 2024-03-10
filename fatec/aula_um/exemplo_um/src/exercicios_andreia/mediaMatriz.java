package exercicios_andreia;

import java.util.Scanner;

public class mediaMatriz {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int soma = 0;
        int m[][];
        m = new int[3][];

        for(int l = 0 ; l < m.length; l++){
            m[l] = new int [3];
            
            for(int c = 0; c < m[l].length; c++){
                System.out.printf("numero da linha %d e coluna %d: " , l, c);
                m[l][c] = sc.nextInt();
                soma = soma + m[l][c];
            }
        }

        for(int l = 0; l < m.length; l++){
            for (int c = 0; c < m[l].length; c++){
                System.out.printf("m[%d][%d] = %d\t", l, c, m[l][c]);
            }
            System.out.println();
        }

        media = soma / (m.length * m.length);
        System.out.printf("Soma = %d ", soma);
        System.out.printf("media = %d ", media);

    }
}
