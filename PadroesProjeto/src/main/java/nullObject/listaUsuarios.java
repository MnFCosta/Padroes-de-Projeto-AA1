package nullObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaUsuarios {
    public static List<Usuario> usuarios = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);

    public static usuarioAbstrato getUser(String name){
        for (Usuario user : usuarios) {
            if (user.getName().equalsIgnoreCase(name)) {
                return new usuarioReal(name);
            }
        }
        return new usuarioNulo(name);
    }

    public static void cadastrarUsuario(Usuario user){
        usuarios.add(user);
    }

    public static String buscarUsuario(){
        System.out.println("Qual é o usuario que deseja?");
        return scan.nextLine();
    }



}
