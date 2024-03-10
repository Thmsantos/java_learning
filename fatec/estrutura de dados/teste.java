public class teste {
    public static void main(String[] args){
        ListaDeInteiros array = new ListaDeInteiros(5);

        try{
            array.adicionaFinal(1000);
            array.adicionaFinal(78);
            array.adicionaFinal(92);
            //array.adicionaFinal(113);
            //array.adicionaFinal(234);
            System.out.println(array.toString());
            int x = array.removeFinal();
            System.out.println("Removido: " + x);
            System.out.println(array.toString());
        }catch(Exception e){
            System.out.println("encheu");
        }
    }
}

//alocação estatica, a lista começa no 0 e termina no tamanho - 1;

//x.charAt(parametro)