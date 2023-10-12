/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Andres Grijalba
 */
public class Proveedor extends Persona {
    
    private Direccion sede;
    private Contacto infoProveedor;

    public Proveedor(Direccion sede, Contacto infoProveedor, String nombre, String id) {
        super(nombre, id);
        this.sede = sede;
        this.infoProveedor = infoProveedor;
    }

    public Direccion getSede() {
        return sede;
    }

    public void setSede(Direccion sede) {
        this.sede = sede;
    }

    public Contacto getInfoProveedor() {
        return infoProveedor;
    }

    public void setInfoProveedor(Contacto infoProveedor) {
        this.infoProveedor = infoProveedor;
    }

}
