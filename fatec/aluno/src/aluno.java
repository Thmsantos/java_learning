public class aluno {
    private String nome;
    private int ra;

    public aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "aluno [nome=" + nome + ", ra=" + ra + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }

    
}
