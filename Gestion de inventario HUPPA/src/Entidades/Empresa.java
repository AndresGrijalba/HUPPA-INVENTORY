/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Andres Grijalba
 */
public class Empresa {
    
    private String nit;
    private Direccion local;

    public Empresa(String nit, Direccion local) {
        this.nit = nit;
        this.local = local;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Direccion getLocal() {
        return local;
    }

    public void setLocal(Direccion local) {
        this.local = local;
    }

}
