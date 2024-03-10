package exercicios_andreia;

import java.util.Scanner;

public class SomaMatriz {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
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
        System.out.printf("Soma = %d ", soma);
    }
}
