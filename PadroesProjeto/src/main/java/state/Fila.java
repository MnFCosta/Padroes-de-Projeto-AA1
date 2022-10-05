package state;

import state.Empty;
import state.Music;
import state.Paused;
import state.PlayerState;

public class Fila {

    private Aluno aluno;

    private EstadoFila estado;

    public Fila(){
        super();
        this.estado = new Vazia(this);
    }

    public void atender() {
        estado.atender();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
        this.setState(new Esperando(this));
    }

    public EstadoFila getState() {
        return estado;
    }

    public void setState(EstadoFila estado) {
        this.estado = estado;
    }
}
