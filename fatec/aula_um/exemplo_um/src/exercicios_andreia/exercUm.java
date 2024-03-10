package exercicios_andreia.array;
import java.util.Scanner;

public class exercUm {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int idades [] = new int [5];
        String Nomes [] = new String[5];
        double Pesos [] = new double [5];
        double altura [] = new double [5];
        double imc [] = new double [5];
        
        for(int i = 0; i < idades.length; i++){
            System.out.print("Digite o " + (i + 1) + "° nome: ");
            Nomes[i] = sc.nextLine();

            System.out.print("Digite a " + (i + 1) + "° idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Digite o " + (i + 1) + "° peso: ");
            Pesos[i] = sc.nextDouble();

            System.out.print("Digite a " + (i + 1) + "° altura: ");
            altura[i] = sc.nextDouble();

            System.out.println("-------------------------------");

            imc[i] = Pesos[i] / (altura[i] * altura[i]);
            sc.nextLine();
        }

        for (int i = 0; i < idades.length; i++){
            System.out.println("Nome: " + Nomes[i] + " -  Idade: " + idades[i] + " - Altura: " + altura[i] + " - Peso: " + Pesos[i] + " - Imc: " + imc[i]);
        }
    }
}
