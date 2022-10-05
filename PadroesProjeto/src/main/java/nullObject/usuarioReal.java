package nullObject;

public class usuarioReal extends usuarioAbstrato {


    public usuarioReal(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome(){
        return String.format("%s está presente no sistema! ",nome);
    }



}
