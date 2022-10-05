package state;


public class Vazia extends EstadoFila{

    public Vazia(Fila fila){
        super(fila);
        System.out.println("A fila está vazia\n");
    }

    @Override
    public void atender() {
        System.out.println("Não há ninguém para atender!");
    }


}
