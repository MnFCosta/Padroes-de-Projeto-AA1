package hookMethod;

public class Aluno extends Usuario {

    public Aluno(String name, double rendaMensal){
        super(name,rendaMensal);
    }


    protected double Valor(){
        return calcularMensalidade();
    }

    private double calcularMensalidade(){
        return this.getRendaMensal() * 0.1;
    }

    public String mensagem(){
        return String.format("A mensalidade anual de %s é %.2fR$\n",this.getName(),this.calcularValorTotal());
    }
}
