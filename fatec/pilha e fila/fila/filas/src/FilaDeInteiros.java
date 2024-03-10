public class FilaDeInteiros {
    private int dados[];
    private int tamanho;
 
    public FilaDeInteiros(int capMax){
        dados = new int[capMax];
        tamanho=0;
    }
 
    public void adiciona (int e)throws Exception{
        if (!cheia()) {
        // não está cheia
        dados[tamanho] = e;
        tamanho = tamanho + 1;
        } else {
        //sim está cheia
        throw new Exception("ERRO! Lista Cheia");
        }
        }
        public boolean cheia(){
            return tamanho == dados.length;
        }
        public String toString(){
            String s = "Elementos: ";
            for (int i = 0; i<tamanho; i++){
                s = s + " " + dados[i];
            }
            s = s + "\nTamanho: " + tamanho;
            return s;
        }
        public int obtemPrimeiro() throws Exception{
            if(vazia())
                throw new Exception("ERRO! Lista Vazia");
            else
               return dados[0];
        }
        public boolean vazia(){
            return tamanho == 0;
        }
 
        public int remove() throws Exception{
            if (vazia())
                throw new Exception("ERRO! Lista Vazia");
            else{
                //guarda o elemento que será removido para retorná-lo no final
                int r = dados[0];
                //move um elemento à esquerda quando a lista tiver mais que um elemento
                for(int i=0;i<tamanho-1;i++){
                    dados[i]=dados[i+1];
                }
                //decrementar o tamanho para ajustá-lo à quantidade de elementos
                tamanho--;
                //retornar o elemento que foi removido
                return r;
            }
        }
}