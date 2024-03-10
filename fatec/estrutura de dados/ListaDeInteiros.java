public class ListaDeInteiros {
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
        dados = new int[capMax];

        //o java pré inicializa os atributos do tipo inteiro
        //com o valor 0, do tipo real com o valor 0.0 e
        //atributos com tipo abstrato de dados são
        //inicializados com null
        //portanto tamanho recebeu 0.

        
    }

    public void adicionaFinal (int e)throws Exception{

            if(dados.length != tamanho){
                System.out.println("não está cheia");
                dados[tamanho] = e;
                tamanho++;
            }else{
                throw new Exception("cheia");
            }
        }
    
}
