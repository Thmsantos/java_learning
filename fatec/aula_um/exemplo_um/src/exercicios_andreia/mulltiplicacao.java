package exercicios_andreia;
import java.util.Scanner;

public class mulltiplicacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x = 0;
        System.out.print("numero um: ");
        float numUM = sc.nextFloat();

        System.out.print("numero dois: ");
        float numDOIS = sc.nextFloat();
        
        x = numUM * numDOIS;

        System.out.print("Soma: " + x);
    }
}
