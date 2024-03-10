import java.util.Scanner;

public class exercicioDezeseis {
    public static void main(String[] main){
        Scanner leitor = new Scanner(System.in);

        int n1, n2, n3;
        int array[] = new int[3];

        System.out.print("N1: ");
        n1 = leitor.nextInt();

        System.out.print("N2: ");
        n2 = leitor.nextInt();

        System.out.print("N3: ");
        n3 = leitor.nextInt();

        
        if(n1 > n2 && n1 > n3){
            array[0] = n1;

            if(n2 < n3){
                array[1] = n2;
                array[2] = n3;
            }

            if(n2 > n3){
                array[1] = n3;
                array[2] = n2;
            }
        }

        if(n2 > n1 && n2 > n3){
            array[0] = n2;

            if(n1 > n3){
                array[1] = n1;
                array[2] = n2;
            }

            if(n3 > n1){
                array[1] = n3;
                array[2] = n1;
            }
        }

        if(n3 > n1 && n3 > n2){
            array[0] = n3;

            if(n1 > n2){
                array[1] = n1;
                array[2] = n2;
            }

            if(n2 > n1){
                array[1] = n2;
                array[2] = n1;
            }
        }

        if(n1 == n2 || n1 == n3 || n2 == n3){
            System.out.print("valores invalidos!");
        }else{
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
    }
}

/* 16. Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente. */