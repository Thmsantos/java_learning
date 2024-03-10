public class Escola {
    public static void main(String[] args){
        
        Aluno a1 = new Aluno("Thiago", 21, 0005);
        Professor p1 = new Professor("Marcos", 54, "BD");

        System.out.println("Aluno: " + a1.getNome() + " Idade: " + a1.getIdade() + "RA: " + a1.getRa());
        System.out.println("Professor: " + p1.getNome() +  " Idade: " + p1.getIdade() + " Disciplina: " + p1.getDisciplina());
    }
}
