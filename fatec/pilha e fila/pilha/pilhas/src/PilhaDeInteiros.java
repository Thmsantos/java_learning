public class PilhaDeInteiros {
    private int dados[];
    private int topo;
 
    public PilhaDeInteiros(int capMax){
        dados = new int[capMax];
        topo = -1;
    }
 
    public boolean cheia(){
        return topo == dados.length-1;
    }
 
    public boolean vazia(){
        return topo == -1;
    }
 
    public void empilha(int e) throws Exception{
        if (cheia())
            throw new Exception("ERRO! Pilha Cheia");
        else{
            dados[++topo]=e;
        }
    }    
 
    public int desempilha() throws Exception{
        int r = -1;
        if (vazia()){
            throw new Exception("ERRO! Pilha Vazia");
        }
        else{
            r = dados[topo--];
        }
        return r;
    }
 
    public String toString(){
        String s="";
        for(int i=0; i<=topo; i++)
            s = s + "\t" + dados[i];
        return s;
    }
}