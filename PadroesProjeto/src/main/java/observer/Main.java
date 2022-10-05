package observer;

public class Main {
    public static void main(String[] args) {
    Professor prof = new Professor("Jorge");
    Aluno aluno = new Aluno("Manoel");

    prof.adicionarObs(aluno);
    prof.chamar(String.format("%s presente?", aluno.getNome()));
    }



}
