package observer;


import java.util.ArrayList;
import java.util.List;

public class Professor implements Observado {

    private String nome;

    private List<Listener> observadores;

    Professor(String nome){
        super();
        this.nome = nome;
    }

    @Override
    public void adicionarObs(Listener listener) {
        getObservadores().add(listener);
    }

    @Override
    public void chamar(String message) {
        for (Listener o : observadores)
            o.responder(this, message);
    }

    private List<Listener> getObservadores() {
        if (observadores == null)
            this.observadores = new ArrayList<Listener>();
        return observadores;
    }

    @Override
    public String toString() {
        return nome;
    }


}
