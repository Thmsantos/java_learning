import java.util.Scanner;

public class exercicioDez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double cotacao, dolares, reais;

        System.out.print("Cotacao: ");
        cotacao = leitor.nextDouble();

        System.out.print("Dolares: ");
        dolares = leitor.nextDouble();

        reais = dolares * cotacao;

        System.out.println(dolares + " dolares = " + reais + " reais");
    }
}

/* 10.

Faça um
programa na
Linguagem Java
que efetue
a apresentação do
valor da
conversão em
real de
um valor
lido em
dólar.O programa
deve solicitar
o valor
da cotação do
dólar e
também a
quantidade de
dólares disponível
com o usuário,
para que
seja apresentado
o valor
em moeda
brasileira */