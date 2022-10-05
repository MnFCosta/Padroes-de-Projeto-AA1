package state;

public abstract class EstadoFila {
    private Fila fila;

    public EstadoFila(Fila fila){
        super();
        this.fila = fila;

    }

    public abstract void atender();

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public Fila getFila() {
        return fila;
    }
}
