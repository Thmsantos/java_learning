import java.util.Scanner;

public class prova {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ListaDeInteiros lista1 = new ListaDeInteiros(4);
        ListaDeInteiros lista2 = new ListaDeInteiros(8);

        int c = 1, valor;

        while(c <= 4){
            System.out.println("num inteiro: ");
            valor = sc.nextInt();
            lista1.adicionaFinal(valor);
            c = c + 1;
        }

        System.out.println(lista1.toString());
        c = 1;

        while(c <= 4){
            valor = lista1.removeFinal();
            lista2.adicionaFinal(valor);
            lista2.adicionaFinal(valor*2+1);
            c++;
        }

        System.out.println(lista2.toString());
    }
}

//catch(exception)