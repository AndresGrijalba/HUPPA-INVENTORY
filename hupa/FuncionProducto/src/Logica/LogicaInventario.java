/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package Logica;
import Persistencia.Inventario;
import Entidades.Producto;
import java.util.Map;
/**
 *
 * @author oswal
 *
public class LogicaInventario {
    private Inventario inventario;

    public LogicaInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void entradaProducto(Producto producto, int cantidad) {
        inventario.agregarProducto(producto, cantidad);
    }

    public void salidaProducto(Producto producto, int cantidad) {
        inventario.quitarProducto(producto, cantidad);
    }
    
    public Producto buscarProducto(String referencia) {
        Map<Producto, Integer> productosDisponibles = inventario.getProductosDisponibles();
        for (Map.Entry<Producto, Integer> entry : productosDisponibles.entrySet()) {
            if (entry.getKey().getReferencia().equals(referencia)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
*/
