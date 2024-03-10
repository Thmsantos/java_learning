package Thiago;
import java.util.Scanner;

public class cinquentaeOito {
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
        
        
    }

    public static int conta_num(int Numero){
        int num_conta;
        num_conta = Numero;
        return num_conta;
    }

    public static String conta_nome(String nome){
        String clienteNome;
        clienteNome = nome;
        return clienteNome;
    }

    public static String conta_cpf(String cpf){
        String clienteCpf;
        clienteCpf = cpf;
        return clienteCpf;
    }

    public static Double conta_saldo(Double saldo){
        Double clienteSaldo;
        clienteSaldo = saldo;
        return clienteSaldo;
    }
         
}

class conta{
    int NumConta;
    String NomeCliente;
    String cpf;
    double saldo;
}