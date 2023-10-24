/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Entidades;

/**
 *
 * @author HP
 */
public enum TipoDeProducto {
    COSMETICO("Cosmetico"),
    ACCESORIO("Accesorio");
    
    private final String categoria;
    
    private TipoDeProducto(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
 
}
