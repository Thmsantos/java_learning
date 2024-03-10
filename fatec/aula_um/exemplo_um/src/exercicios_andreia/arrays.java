package exercicios_andreia;
import java.util.Scanner;

public class arrays {
    public static void main(String args[]){
        int idades[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < idades.length; i++){
            System.out.print("Digite a " + (i+1) + "° idade: ");
            idades[i] = sc.nextInt();
        }

        for(int i = 0; i < idades.length; i++){
            System.out.print("," + idades[i] + "\t");
        }
        
    }
}
