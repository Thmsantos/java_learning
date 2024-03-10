import java.util.Scanner;

public class vinteeSete {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int codigoLanche, qtd;
        double valor;

        lanche lancheUm = new lanche();
        lanche lancheDois = new lanche();
        lanche lancheTres = new lanche();
        lanche lancheQuatro= new lanche();
        lanche lancheCinco = new lanche();
        lanche lancheSeis = new lanche();

        lancheUm.especific = "Cachorro quente";
        lancheUm.codigo = 100 ;
        lancheUm.preco = 1.20;

        lancheDois.especific = "Bauru simples";
        lancheDois.codigo = 101;
        lancheDois.preco = 1.30;

        lancheTres.especific = "Bauru com ovo";
        lancheTres.codigo =  102;
        lancheTres.preco = 1.50;

        lancheQuatro.especific = "Hambúrger";
        lancheQuatro.codigo = 103;
        lancheQuatro.preco = 1.20;

        lancheCinco.especific = "Cheeseburguer";
        lancheCinco.codigo = 104;
        lancheCinco.preco = 1.30;

        lancheSeis.especific = "Refrigerante";
        lancheSeis.codigo = 105;
        lancheSeis.preco = 1.00;

        System.out.print("Codigo do lanche: ");
        codigoLanche = leitor.nextInt();

        System.out.print("Quantidade: ");
        qtd = leitor.nextInt();

        if(codigoLanche == 100){
            valor = lancheUm.preco * qtd;
            System.out.println("Valor: " + valor);
        }

        if(codigoLanche == 101){
            valor = lancheDois.preco * qtd;
            System.out.println("Valor: " + valor);
        }

        if(codigoLanche == 102){
            valor = lancheTres.preco * qtd;
            System.out.println("Valor: " + valor);
        }

        if(codigoLanche == 103){
            valor = lancheQuatro.preco * qtd;
            System.out.println("Valor: " + valor);
        }

        if(codigoLanche == 104){
            valor = lancheCinco.preco * qtd;
            System.out.println("Valor: " + valor);
        }

        if(codigoLanche == 105){
            valor = lancheSeis.preco * qtd;
            System.out.println("Valor: " + valor + "0");
        }

    }
}

class lanche{
    String especific;
    int codigo;
    double preco;
}
