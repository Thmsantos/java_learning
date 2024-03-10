import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n1, n2, resultado;

        System.out.print("Numero um: ");
        n1 = leitor.nextInt();

        System.out.print("Numero Dbois: ");
        n2 = leitor.nextInt();

        resultado = n1 * n2;

        System.out.printf("%d * %d = %d" , n1, n2, resultado);
    }
}

//multiplicacao

