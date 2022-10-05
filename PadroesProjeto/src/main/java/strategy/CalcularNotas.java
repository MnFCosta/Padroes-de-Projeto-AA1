package strategy;

public class CalcularNotas {

    public double calcular(Notas notas, TipoMedia tipo){
        return tipo.calcular(notas);
    }
}
