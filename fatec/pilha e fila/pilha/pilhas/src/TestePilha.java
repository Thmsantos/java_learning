import java.util.Scanner;
 
public class TestePilha {
     public static void main(String args[]){
      PilhaDeInteiros f1 = new PilhaDeInteiros(4);
      int op, valor;   
      Scanner sc = new Scanner(System.in);
      do{
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Consultar a Pilha");
            System.out.println("99-Sair");
            op=sc.nextInt();
            try{
                switch(op){
                    case 1: 
                       System.out.println("Valor? ");
                       valor = sc.nextInt();
                       f1.empilha(valor);
                       break;
                    case 2:
                       valor= f1.desempilha();
                       System.out.println("Elemento removido "+valor);
                       break;   
                    case 3:
                       if (f1.vazia()){
                        System.out.println("Não há elementos na lista");
                       } else {
                         System.out.println("Pilha: " + f1.toString());
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
