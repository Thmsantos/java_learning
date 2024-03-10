package exercicios_andreia;
import java.util.Scanner;

public class matriz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m[][];
        m = new int[3][];
        for(int l = 0 ; l < m.length; l++){
            m[l] = new int [3];
            
            for(int c = 0; c < m[l].length; c++){
                System.out.printf("numero da linha %d e coluna %d: " , l, c);
                m[l][c] = sc.nextInt();
            }
        }

        for(int l = 0; l < m.length; l++){
            for (int c = 0; c < m[l].length; c++){
                System.out.printf("m[%d][%d] = %d\t", l, c, m[l][c]);
            }
            System.out.println();
        }
    }
}