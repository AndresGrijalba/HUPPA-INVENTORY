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
public interface IUsuario {
    void agregarUsuario(Usuario usuario);
    void mostrarListaUsuario();
    void modificarUsuario(String id, Usuario nuevoUsuario);
    void borrarUsuario(String id);
    Usuario buscarUsuario(String id);
}
