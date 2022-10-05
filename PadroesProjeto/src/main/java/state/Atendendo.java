package state;

public class Atendendo extends EstadoFila{

    public Atendendo(Fila fila){
        super(fila);
        System.out.printf("Estou atendendo %s\n", getFila().getAluno().getNome());
    }

    @Override
    public void atender() {
        getFila().setState(new Esperando(getFila()));
    }
}
