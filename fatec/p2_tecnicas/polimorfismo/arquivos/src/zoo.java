import java.util.Scanner;

public class zoo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String animal;

        System.out.println("animal: ");
        animal = sc.nextLine();

        cao c1 = new cao();
        gato g1 = new gato();
        animal a1 = new animal();

        if(animal == "cao" || animal == "cachorro"){
            c1.barulho();
        }else if(animal == "gato"){
            g1.barulho();
        }else{
            a1.barulho();
        }

    }
}
