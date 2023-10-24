/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import Entidades.Usuario;

/**
 *
 * @author oswal
 */
import java.util.ArrayList;
import java.util.List;

public class ListaUsuario implements IUsuario {
    private List<Usuario> listaUsuarios;

    public ListaUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    @Override
    public void mostrarListaUsuario() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println("ID: " + usuario.getId() + "       , Nombre: " + usuario.getNombre()+"           Nombre de Usuario"
                    +usuario.getName()+"        Contraseña"+usuario.getPassword()+"      Nivel"+usuario.getNivel());
        }
    }

    @Override
    public void modificarUsuario(String id, Usuario nuevoUsuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId().equals(id)) {
                listaUsuarios.set(i, nuevoUsuario);
                return;
            }
        }
    }

    @Override
    public void borrarUsuario(String id) {
        listaUsuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    @Override
    public Usuario buscarUsuario(String id) {
    for (Usuario usuario : listaUsuarios) {
        if (usuario.getId().equals(id)) {
            
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Nombre de Usuario: " + usuario.getName());
            System.out.println("Contraseña: " + usuario.getPassword());
            System.out.println("Nivel: " + usuario.getNivel());

            return usuario;
        }
    }
    System.out.println("Usuario no encontrado.");
    return null;
}
}



