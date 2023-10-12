/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Andres Grijalba
 */
public class Accesorios extends Producto {
    
    private String detalle;

    public Accesorios(String detalle, String referencia, String descripcion, String estado) {
        super(referencia, descripcion, estado);
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
