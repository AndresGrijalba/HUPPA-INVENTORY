/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Andres Grijalba
 */
public class Cliente extends Persona {
    
    private Direccion domicilio;
    private Contacto infocontact;

    public Cliente(Direccion domicilio, Contacto infocontact, String nombre, String id) {
        super(nombre, id);
        this.domicilio = domicilio;
        this.infocontact = infocontact;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getInfocontact() {
        return infocontact;
    }

    public void setInfocontact(Contacto infocontact) {
        this.infocontact = infocontact;
    }
    
    
    
    
}
