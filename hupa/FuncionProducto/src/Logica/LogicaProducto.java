/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Producto;
import Persistencia.*;
import java.util.List;

/**
 *
 * @author HP
 */
public class LogicaProducto {
    
    private IProducto data ;

    public LogicaProducto() {
        this.data = new ListaProducto();
    }
    
    public void registrarProducto(Producto f){
       this.data.adicionarProducto(f);
    }
    
    public List<Producto> consultarProducto(){
        return this.data.obtenerproductos();
    }
    
    public Producto confirmarbusquedaProducto(String CarProducto, int opcionBusqueda){
        Producto f = this.data.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
        return f;
    }
    
    public Producto buscarProducto(String CarProducto, int opcionBusqueda){
        Producto f = this.data.buscarProducto(CarProducto, opcionBusqueda);
        return f;
    }
    
    public void eliminarProducto(Producto f){
        this.data.quitarProducto(f);
    }
}
