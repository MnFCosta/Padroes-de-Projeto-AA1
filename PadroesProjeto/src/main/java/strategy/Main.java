package strategy;

public class Main {
    public static void main(String[] args){
        Notas nota = new Notas(10,10);

        CalcularNotas calculadora = new CalcularNotas();

        System.out.println(calculadora.calcular(nota, new MP()));
    }
}
