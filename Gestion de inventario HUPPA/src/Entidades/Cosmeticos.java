/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Andres Grijalba
 */
public class Cosmeticos extends Producto {
    
    private LocalDate fechadecaducidad;

    public Cosmeticos(LocalDate fechadecaducidad, String referencia, String descripcion, String estado) {
        super(referencia, descripcion, estado);
        this.fechadecaducidad = fechadecaducidad;
    }

    public LocalDate getFechadecaducidad() {
        return fechadecaducidad;
    }

    public void setFechadecaducidad(LocalDate fechadecaducidad) {
        this.fechadecaducidad = fechadecaducidad;
    }

    
    
}
