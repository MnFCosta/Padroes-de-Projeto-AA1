package nullObject;



public class Main {
    public static void main(String[] args){
       listaUsuarios.cadastrarUsuario(new Usuario("Jorge"));

       usuarioAbstrato usuario = listaUsuarios.getUser(listaUsuarios.buscarUsuario());

       System.out.println(usuario.getNome());


    }
}
