package strategy;

public class MP implements TipoMedia {

    public double calcular(Notas notas){
        return Math.round(((notas.getValor()*1) + (notas.getValor2()*2))/3);
    }
}
