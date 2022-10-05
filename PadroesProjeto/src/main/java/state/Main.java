package state;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.atender();
        System.out.println(fila.getState());

        Aluno aluno = new Aluno("Jorge");
        System.out.println(fila.getState());
        fila.setAluno(aluno);
        System.out.println(fila.getState());
        fila.atender();
        System.out.println(fila.getState());
        fila.atender();


    }

}
