/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.InformacionDeContacto;
import Entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oswal
 */
public class ListaProveedor {
    public static void registrarProveedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del cliente:");
        String id = scanner.nextLine();

        // Llama al método registrarInformacionDeContacto para obtener la información de contacto
        InformacionDeContacto infocontact = InformacionDeContacto.registrarInformacionDeContacto();

        // Crea un nuevo cliente y lo agrega a la lista de clientes registrados
        Proveedor nuevoProveedor = new Proveedor(infocontact, nombre, id);
        proveedoresRegistrados.add(nuevoProveedor);
        System.out.println("Cliente registrado con éxito.");
    }

    public static void mostrarProveedoresRegistrados() {
        if (proveedoresRegistrados.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes registrados:");
            for (Proveedor proveedor : proveedoresRegistrados) {
                System.out.println("Nombre: " + proveedor.getNombre());
                System.out.println("ID: " + proveedor.getId());
                System.out.println("Información de contacto:");
                InformacionDeContacto infocontact = proveedor.getInfocontact();
                System.out.println("Calle: " + infocontact.getCalle());
                System.out.println("Barrio: " + infocontact.getBarrio());
                System.out.println("Ciudad: " + infocontact.getCiudad());
                System.out.println("País: " + infocontact.getPais());
                System.out.println("Detalle: " + infocontact.getDetalle());
                System.out.println("Teléfono: " + infocontact.getTelefono());
                System.out.println("Correo: " + infocontact.getCorreo());
                System.out.println();
            }
        }
    }

    // Asegúrate de que esta lista esté declarada y se inicialice en algún lugar de tu programa.
    private static List<Proveedor> proveedoresRegistrados = new ArrayList<>();
    
    

    public static void modificarProveedor(String nombreProveedor) {
    for (Proveedor proveedor : proveedoresRegistrados) {
        if (proveedor.getNombre().equalsIgnoreCase(nombreProveedor)) {
            System.out.println("¿Qué atributo del proveedor desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Información de contacto");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Nuevo nombre del proveedor:");
                    String nuevoNombre = scanner.nextLine();
                    proveedor.setNombre(nuevoNombre);
                    System.out.println("Nombre del proveedor modificado con éxito.");
                    break;
                     
    
                case 2:
                     System.out.println("Nuevos datos de Información de Contacto:");
                    InformacionDeContacto infoContacto = proveedor.getInfocontact();
                    // Solicitar y actualizar los atributos de InformacionDeContacto
                    System.out.print("Ingrese la calle: ");
                    String nuevaCalle = scanner.nextLine();
                    infoContacto.setCalle(nuevaCalle);
                   
                    System.out.print("Ingrese el barrio: ");
                    String nuevoBarrio = scanner.nextLine();
                    infoContacto.setBarrio(nuevoBarrio);

                    System.out.print("Ingrese la ciudad: ");
                    String nuevaCiudad = scanner.nextLine();
                    infoContacto.setCiudad(nuevaCiudad);

                    System.out.print("Ingrese el país: ");
                    String nuevoPais = scanner.nextLine();
                    infoContacto.setPais(nuevoPais);

                    System.out.print("Ingrese detalles adicionales: ");
                    String nuevoDetalle = scanner.nextLine();
                    infoContacto.setDetalle(nuevoDetalle);

                    System.out.print("Ingrese el número de teléfono: ");
                    String nuevoTelefono = scanner.nextLine();
                    infoContacto.setTelefono(nuevoTelefono);

                    System.out.print("Ingrese el correo electrónico: ");
                    String nuevoCorreo = scanner.nextLine();
                    infoContacto.setCorreo(nuevoCorreo);

                    proveedor.setInfocontact(infoContacto);

                    System.out.println("Información de contacto del cliente modificada con éxito.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            return; 
        }
    }
    System.out.println("Proveedor no encontrado.");
}


    public static void borrarProveedor(String nombreProveedor) {
        boolean proveedorEncontrado = false;

        for (Proveedor proveedor : proveedoresRegistrados) {
            if (proveedor.getNombre().equalsIgnoreCase(nombreProveedor)) {
                proveedoresRegistrados.remove(proveedor);
                proveedorEncontrado = true;
                break;
            }
        }

        if (proveedorEncontrado) {
            System.out.println("Proveedor eliminado con éxito.");
        } else {
            System.out.println("Proveedor no encontrado.");
        }
    }

   
}
