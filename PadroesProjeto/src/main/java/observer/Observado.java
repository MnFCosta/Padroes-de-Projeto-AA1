package observer;

public interface Observado {

    public void adicionarObs(Listener listener);

    public void chamar(String message);

}