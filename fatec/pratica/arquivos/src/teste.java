public class teste {
    public static void main(String[] args) {
        ListaLigada L1 = new ListaLigada();
        ListaLigada L2 = new ListaLigada();

        try{
            L1.adicionaInicio(10);
            L1.adicionaInicio(11);
            L1.adicionaInicio(20);
            L1.adicionaInicio(21);
            L1.adicionaInicio(30);
            L1.adicionaInicio(31);
            L1.adicionaInicio(40);
            L1.adicionaInicio(41);
            L1.adicionaInicio(50);
            L1.adicionaInicio(51);

            System.out.println(L1.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
