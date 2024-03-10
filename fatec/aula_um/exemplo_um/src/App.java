import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nome: ");
        String nome = sc.nextLine();

        System.out.print("idade: ");
        int idade = sc.nextInt();
        System.out.println("salve " + nome + " , " + idade + " anos");
    }
}
