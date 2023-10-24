/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author oswal
 */
public class InformacionDeContacto {
    private String calle;
    private String barrio;
    private String ciudad;
    private String pais;
    private String detalle;
    private String telefono;
    private String correo;

    public InformacionDeContacto(String calle, String barrio, String ciudad, String pais, String detalle, String telefono, String correo) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.pais = pais;
        this.detalle = detalle;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Método para registrar un objeto de InformacionDeContacto
    public static InformacionDeContacto registrarInformacionDeContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la calle:");
        String calle = scanner.nextLine();
        System.out.println("Ingrese el barrio:");
        String barrio = scanner.nextLine();
        System.out.println("Ingrese la ciudad:");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese el país:");
        String pais = scanner.nextLine();
        System.out.println("Ingrese detalles adicionales:");
        String detalle = scanner.nextLine();
        System.out.println("Ingrese el número de teléfono:");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese el correo electrónico:");
        String correo = scanner.nextLine();

        return new InformacionDeContacto(calle, barrio, ciudad, pais, detalle, telefono, correo);
    }

    // Getters y setters
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}