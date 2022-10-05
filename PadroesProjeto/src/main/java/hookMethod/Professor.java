package hookMethod;


public class Professor extends Usuario {

    public Professor(String name, double rendaMensal){
        super(name,rendaMensal);
    }

    @Override
    public double Valor(){
        return this.getRendaMensal();
    }

    @Override
    public String mensagem(){
        return String.format("O salário anual de %s é %.2fR$\n",this.getName(),this.calcularValorTotal());
    }
}
