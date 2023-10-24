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
public class Empresa {
    private String nombre;
    private InformacionDeContacto infocontact;

    public Empresa(String nombre, InformacionDeContacto infocontact) {
        this.nombre = nombre;
        this.infocontact = infocontact;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public InformacionDeContacto getInfocontact() {
        return infocontact;
    }

    public void setInfocontact(InformacionDeContacto infocontact) {
        this.infocontact = infocontact;
    }

    public static void registrarEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa:");
        String nombre = scanner.nextLine();

        // Llama al método registrarInformacionDeContacto para obtener la información de contacto
        InformacionDeContacto infocontact = InformacionDeContacto.registrarInformacionDeContacto();

        // Crea una nueva empresa
        Empresa nuevaEmpresa = new Empresa(nombre, infocontact);

        // Muestra la información de la empresa registrada
        System.out.println("Empresa registrada con éxito:");
        mostrarEmpresa(nuevaEmpresa);
    }

    public static void mostrarEmpresa(Empresa empresa) {
        if (empresa == null) {
            System.out.println("No hay una empresa registrada.");
        } else {
            System.out.println("Nombre de la empresa: " + empresa.getNombre());
            System.out.println("Información de contacto:");
            System.out.println("Calle: " + empresa.getInfocontact().getCalle());
            System.out.println("Barrio: " + empresa.getInfocontact().getBarrio());
            System.out.println("Ciudad: " + empresa.getInfocontact().getCiudad());
            System.out.println("País: " + empresa.getInfocontact().getPais());
            System.out.println("Detalle: " + empresa.getInfocontact().getDetalle());
            System.out.println("Teléfono: " + empresa.getInfocontact().getTelefono());
            System.out.println("Correo: " + empresa.getInfocontact().getCorreo());
        }
    }

   
}
