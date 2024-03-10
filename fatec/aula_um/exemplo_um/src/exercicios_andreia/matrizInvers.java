package exercicios_andreia;
import java.util.Scanner;

public class matrizInvers {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int m[][];

        m = new int[3][];

        for(int l = 0; l < m.length; l++){
            m[l] = new int [3];

            for(int c = 0; c < m[l].length; c++){
                System.out.printf("linha %d, coluna %d: ", l, c);
                m[l][c] = sc.nextInt();

            }
        }

        //matriz inversa

        System.out.println("-----------------");

        System.out.println("matriz normal");

        for(int l = 0; l < m.length; l++){
            for(int c = 0; c < m[l].length; c++){
                System.out.printf("m[%d][%d] = %d\t", l, c, m[l][c]);
            }
            System.out.println();
        }
        
        System.out.println("-----------");
        

        for(int l = 0; l < m.length; l++){
            for(int c = 0; c < m[l].length; c++){
               System.out.printf("m[%d][%d] = %d\t", c, l, m[c][l]);
            }
            System.out.println();
        }
    }
}
