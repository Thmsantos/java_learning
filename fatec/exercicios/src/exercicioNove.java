import java.util.Scanner;

public class exercicioNove {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);

        int valor, prestacao, taxa, tempo;

        System.out.print("valor: ");
        valor = leitor.nextInt();

        System.out.print("taxa: ");
        taxa = leitor.nextInt();

        System.out.print("tempo: ");
        tempo = leitor.nextInt();

        prestacao = valor + (valor * (taxa/100) * tempo);
        System.out.println("valor do atrasao: " + prestacao);
    }
}
