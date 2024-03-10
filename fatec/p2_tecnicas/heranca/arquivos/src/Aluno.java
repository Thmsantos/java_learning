public class Aluno extends Pessoa{
    private int ra;

    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
    }

    public void setRa(int ra){
        this.ra = ra;
    }

    public int getRa(){
        return ra;
    }
}
