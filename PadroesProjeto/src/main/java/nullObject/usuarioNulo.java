package nullObject;


public class usuarioNulo extends usuarioAbstrato {


    public usuarioNulo(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return String.format("%s não está presente no sistema",nome);
    }
}
