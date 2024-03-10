public class teste {
    public static void main(String[] args){
        ListaDeInteiros array = new ListaDeInteiros(5);

        try{
            array.adicionaFinal(1000);
            array.adicionaFinal(78);
            array.adicionaFinal(92);
            array.adicionaFinal(113);
            array.adicionaFinal(234);
            array.adicionaFinal(328);
        }catch(Exception e){
            System.out.println("encheu");
        }
    }
}
