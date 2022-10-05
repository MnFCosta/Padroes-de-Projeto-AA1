package state;

public class Esperando extends EstadoFila{

    public Esperando (Fila fila){
        super(fila);
        System.out.printf("%s está esperando\n", getFila().getAluno().getNome());
    }

    @Override
    public void atender() {
        getFila().setState(new Atendendo(getFila()));
    }


}
