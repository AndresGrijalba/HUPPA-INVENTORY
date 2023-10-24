/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface IProducto {

    public void adicionarProducto(Producto f);
    public ArrayList<Producto> obtenerproductos();
    public Producto confirmarbusquedaProducto(String CarProducto, int opcionBusqueda);
    public Producto buscarProducto(String RefCliente, int opcionBusqueda);
    public void quitarProducto(Producto f);
    //public Producto modificarProducto(String mod, int opM);
}
