package exercicios_andreia;
import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("numero um: ");
        int numUM = sc.nextInt();

        System.out.print("numero dois: ");
        int numDOIS = sc.nextInt();
        x = numUM + numDOIS;

        System.out.println("Soma = " + x);
    }
}
