/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.*;
import java.time.LocalDate;
import java.util.List;

import java.util.Scanner;


/**
 *
 * @author oswal
 */


public class Inventario {
    private ListaProducto productosDisponibles;

    public Inventario(ListaProducto productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    

    public Producto buscarProducto(String referencia) {
        return productosDisponibles.buscarProducto(referencia,1);
    }

    // Otros métodos de Inventario



    public void EntradaProducto(String referencia, int cantidadEntrada) {
    Producto producto = buscarProducto(referencia);
    
    if (producto == null) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("El producto con referencia " + referencia + " no se encuentra en el inventario.");
        System.out.println("¿Desea crearlo? (S/N): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("¿Accesorio o Cosmético? A/C : ");
            String tipoProducto = scanner.nextLine();
            
            if (tipoProducto.equalsIgnoreCase("A")) {
                System.out.print("Ingrese el detalle del Accesorio: ");
                String detalle = scanner.nextLine();
                System.out.print("Ingrese la descripción: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese el estado: ");
                String estado = scanner.nextLine();
                System.out.print("Ingrese la categoría: ");
                String categoria = scanner.nextLine();
                System.out.print("Ingrese la cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                
                Accesorio nuevoAccesorio = new Accesorio(detalle, referencia, descripcion, estado, categoria, nuevaCantidad);
                productosDisponibles.adicionarProducto(nuevoAccesorio);
                System.out.println("Producto creado y agregado al inventario.");
            } else if (tipoProducto.equalsIgnoreCase("C")) {
                System.out.print("Ingrese la descripción: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese el estado: ");
                String estado = scanner.nextLine();
                System.out.print("Ingrese la categoría: ");
                String categoria = scanner.nextLine();
                System.out.print("Ingrese la cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                System.out.print("Ingrese la fecha de caducidad (AAAA-MM-DD): ");
                String fechaCaducidadStr = scanner.nextLine();
                LocalDate fechaCaducidad = LocalDate.parse(fechaCaducidadStr);
                
                
                Cosmetico nuevoCosmetico = new Cosmetico(fechaCaducidad,referencia, descripcion, estado, categoria, nuevaCantidad);
                nuevoCosmetico.setFechaDeCaducidad(fechaCaducidad);
                productosDisponibles.adicionarProducto(nuevoCosmetico);
                System.out.println("Producto creado y agregado al inventario.");
            } else {
                System.out.println("Tipo de producto no válido. No se creó el producto.");
            }
        } else {
            System.out.println("El producto no se creó.");
        }
    } else {
        int cantidadActual = producto.getCantidad();
        producto.setCantidad(cantidadActual + cantidadEntrada);
        System.out.println("Cantidad actualizada en el inventario.");
    }
}


    public void SalidaProducto(String referencia, int cantidadSalida) {
        Producto producto = buscarProducto(referencia);
        if (producto != null) {
            int cantidadActual = producto.getCantidad();
            if (cantidadActual >= cantidadSalida) {
                producto.setCantidad(cantidadActual - cantidadSalida);
                if (producto.getCantidad() == 0) {
                    producto.setEstado(EstadoDeProducto.AGOTADO.getEstado());
                }
            } else {
                System.out.println("No hay suficiente cantidad en inventario para la salida solicitada.");
            }
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }
    
    

    public void mostrarListaProductos() {
        List<Producto> listaProductos = productosDisponibles.obtenerproductos();
        
        if (listaProductos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Lista de Productos en Inventario:");
            for (Producto producto : listaProductos) {
                System.out.println("Referencia: " + producto.getReferencia());
                System.out.println("Descripción: " + producto.getDescripcion());
                System.out.println("Estado: " + producto.getEstado());
                System.out.println("Categoría: " + producto.getCategoria());
                System.out.println("Cantidad: " + producto.getCantidad());
                if (producto instanceof Accesorio) {
                    System.out.println("Detalle: " + ((Accesorio) producto).getDetalle());
                }
                System.out.println("------------------------------------");
            }
        }
    }
}

