package hookMethod;


import java.util.Scanner;

public abstract class Usuario{
    private String name;
    private double rendaMensal;

    public Usuario(String name, double rendaMensal){
        super();
        this.name = name;
        this.rendaMensal = rendaMensal;
    }
    public double calcularValorTotal(){
        return Valor() * 12;
    }

    protected abstract double Valor();

    public abstract String mensagem();

    public String getName() {
        return name;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

}
