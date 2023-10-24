/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Entidades;

/**
 *
 * @author HP
 */
public enum EstadoDeProducto {
    
    DISPONIBLE("Disponible"), 
    AGOTADO("Agotado"),
    INACTIVO("Inactivo");

    private final String estado;
    
    private EstadoDeProducto(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
 
}
