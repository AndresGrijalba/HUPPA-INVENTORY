/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ListaProducto implements IProducto{
    
    private List<Producto> listaProductos;

    public ListaProducto() {
        this.listaProductos = new ArrayList();
    }
 public Producto buscarProducto(String referencia) {
        for (Producto producto : listaProductos) {
            if (producto.getReferencia().equals(referencia)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }
    @Override
    public void adicionarProducto(Producto f) {
        this.listaProductos.add(f);
    }

    @Override
    public ArrayList<Producto> obtenerproductos() {
        ArrayList<Producto> lista = new ArrayList(this.listaProductos);
        return lista;
    }
    
    @Override
    public Producto confirmarbusquedaProducto(String CarProducto, int opcionBusqueda){
        Producto productoBuscado = null;
        switch (opcionBusqueda) {
            case 1 -> {
                for(Producto f: this.listaProductos){
                    if(f.getReferencia().equals(CarProducto)){
                        productoBuscado = f;
                        break;
                    }
                }
            }
            case 2 -> {
                for(Producto f: this.listaProductos){
                    if(f.getDescripcion().equals(CarProducto)){
                        productoBuscado = f;
                        break;
                    }
                }
            }
            case 3 -> {
                for(Producto f: this.listaProductos){
                    if(f.getCategoria().equals(CarProducto)){
                        productoBuscado = f;
                        break;
                    }
                }
            }
            case 4 -> {
                for(Producto f: this.listaProductos){
                    if(f.getEstado().equals(CarProducto)){
                        productoBuscado = f;
                        break;
                    }
                }
            }
        }
        return productoBuscado;
    }
    
    @Override
    public Producto buscarProducto(String CarProducto, int opcionBusqueda){
        Producto productoBuscado = null;
        switch (opcionBusqueda) {
            case 1 -> {
                for(Producto f: this.listaProductos){
                    if(f.getReferencia().equals(CarProducto)){
                        productoBuscado = f;
                        System.out.println(productoBuscado.toString());
                    }
                }
            }
            case 2 -> {
                for(Producto f: this.listaProductos){
                    if(f.getDescripcion().equals(CarProducto)){
                        productoBuscado = f;
                        System.out.println(productoBuscado.toString());
                    }
                }
            }
            case 3 -> {
                for(Producto f: this.listaProductos){
                    if(f.getCategoria().equals(CarProducto)){
                        productoBuscado = f;
                        System.out.println(productoBuscado.toString());
                    }
                }
            }
            case 4 -> {
                for(Producto f: this.listaProductos){
                    if(f.getEstado().equals(CarProducto)){
                        productoBuscado = f;
                        System.out.println(productoBuscado.toString());
                    }
                }
            }
        }
        return productoBuscado;
    }
    
    @Override
    public void quitarProducto(Producto f){
        this.listaProductos.remove(f);
    }
   
}
