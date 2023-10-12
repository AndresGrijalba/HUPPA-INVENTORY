/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Andres Grijalba
 */
public class Direccion {
    
    private String calle;
    private String barrio;
    private String ciudad;
    private String pais;
    private String detalle;

    public Direccion(String calle, String barrio, String ciudad, String pais, String detalle) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.pais = pais;
        this.detalle = detalle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", barrio=" + barrio + ", ciudad=" + ciudad + ", pais=" + pais + ", detalle=" + detalle + '}';
    }

}
