/* import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class exercicioSete {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        
        int ano, dia, mes;
        LocalDate dataNasc;
        LocalDate dataAtual = LocalDate.now();

        System.out.print("ano: ");
        ano = leitor.nextInt();

        System.out.print("mes: ");
        mes = leitor.nextInt();

        System.out.print("dia: ");
        dia = leitor.nextInt();

        dataNasc = LocalDate.of(ano, mes, dia);

        System.out.println(Period.between(dataNasc, dataAtual).g);

    }
}
 */

/* public int calculateAge(
  LocalDate birthDate,
  LocalDate currentDate) {
    // validate inputs ...
    return Period.between(birthDate, currentDate).getYears();
} */