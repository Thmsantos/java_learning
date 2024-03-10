import java.util.Scanner;

public class VinteeDois {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int maior;
        int array[] = new int[3];

        for(int i = 0; i < array.length; i++){
            System.out.printf("%d° numero: ", i+1);
            array[i] = leitor.nextInt();
        }
   
        if(array[0] == array[1] || array[0] == array[2] || array[1] == array[2]){
            System.out.println("Valores invalidos");
        }else{
            if(array[0] > array[1] && array[0] > array[2]){
                maior = array[0];
                System.out.println(maior);
            }

            if(array[1] > array[0] && array[1] > array[2]){
                maior = array[1];
                System.out.println(maior);
            }

            if(array[2] > array[1] && array[2] > array[0]){
                maior = array[2];
                System.out.println(maior);
            }
        }

    }    
}
 
/* 22. Faça um programa na Linguagem  Java  que leia 3 números inteiros e mostre o maior deles. */