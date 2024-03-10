public class TesteListaLgd {
    public static void main(String[] args) {
        ListaLigada l1 = new ListaLigada();
        try{
            l1.adicionaFinal(15);
            System.out.println("REMOVIDO: " + l1.removeFinal());

            l1.adicionaFinal(175);
            l1.adicionaFinal(1523);
            System.out.println("REMOVIDO: " + l1.removeFinal());

            l1.adicionaFinal(225);
            l1.adicionaFinal(45523);
            l1.adicionaFinal(37432);
            l1.adicionaFinal(3523);

            System.out.println("REMOVIDO: " + l1.removeFinal());

            System.out.println(l1.toString());


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
