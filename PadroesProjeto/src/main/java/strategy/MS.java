package strategy;

public class MS implements TipoMedia {
        public double calcular(Notas notas){
            return (notas.getValor() + notas.getValor2())/2;
        }
}


