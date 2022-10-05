package observer;

public class Aluno implements Listener {

    private String nome;

    Aluno(String nome){
        super();
        this.nome = nome;
    }


    @Override
    public void responder(Observado observado, String message) {
        System.out.printf("%s : Presente professor %s!\n",message,observado);
    }

    public String getNome() {
        return nome;
    }
}
