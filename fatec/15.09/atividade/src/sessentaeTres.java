import java.util.Scanner;

public class sessentaeTres {
    public static void main(String[] args){
        System.out.println("hello");
        Retangulo ret = new Retangulo();
        Scanner leitor = new Scanner(System.in);
        int altura, largura;

        System.out.println("Altura: ");
        altura = leitor.nextInt();

        System.out.println("Largura: ");
        largura = leitor.nextInt();


        ret.setAltura(altura);
        ret.setLargura(largura);

        ret.Area();

    }

  
}
