import java.util.Scanner;
 
public class TesteFila {
    public static void main(String args[]){
      FilaDeInteiros f1 = new FilaDeInteiros(4);
      int op, valor;   
      Scanner sc = new Scanner(System.in);
      do{
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Consultar a Fila");
            System.out.println("99-Sair");
            op=sc.nextInt();
            try{
                switch(op){
                    case 1: 
                       System.out.println("Valor? ");
                       valor = sc.nextInt();
                       f1.adiciona(valor);
                       break;
                    case 2:
                       valor= f1.remove();
                       System.out.println("Elemento removido "+valor);
                       break;   
                    case 3:
                       if (f1.vazia()){
                        System.out.println("Não há elementos na lista");
                       } else {
                         System.out.println("Fila: " + f1.toString());
                       }
                       break;
                    
                    case 99:
                       System.out.println("Saindo.... ");
                       break;
                    default:
                       System.out.println("Opção Inválida");
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
       } while(op != 99);
    }
    
        
}