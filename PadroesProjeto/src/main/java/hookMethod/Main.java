package hookMethod;


public class Main {
    public static void main(String[] args){
        Usuario user = new Aluno("Pedro", 1000);
        Usuario prof = new Professor("Jorge", 1000);

        System.out.print(user.mensagem());
        System.out.print(prof.mensagem());

    }
}
