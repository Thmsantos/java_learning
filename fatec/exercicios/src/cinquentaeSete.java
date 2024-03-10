package Thiago;
import java.util.Scanner;

public class cinquentaeSete {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        conta contaUm = new conta(); 

        System.out.print("Conta: ");
        contaUm.NumConta = leitor.nextInt();

        System.out.print("Nome Cliente: ");
        contaUm.NomeCliente = leitor.nextLine();
        leitor.nextLine();

        System.out.print("Cpf: ");
        contaUm.cpf = leitor.nextLine();

        System.out.print("Saldo: ");
        contaUm.saldo = leitor.nextDouble(); 

        System.out.println("Dados: ");
        System.out.println("_________________________________");
        System.out.println("Numero da Conta: " + contaUm.NumConta);
        System.out.println("_________________________________");
        System.out.println("Cliente: " + contaUm.NomeCliente);
        System.out.println("_________________________________");
        System.out.println("Cpf: " + contaUm.cpf);
        System.out.println("_________________________________");
        System.out.println("Saldo: " + contaUm.saldo);
    }
    
}

class conta{
    int NumConta;
    String NomeCliente;
    String cpf;
    double saldo;
}