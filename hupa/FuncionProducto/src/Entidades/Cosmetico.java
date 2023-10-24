/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Cosmetico extends Producto{
    
    private LocalDate fechaDeCaducidad;

    public Cosmetico(LocalDate fechaDeCaducidad, String referencia, String descripcion, String estado, String categoria, int cantidad) {
        super(referencia, descripcion, estado, categoria, cantidad);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String toString() {
        return String.format("%15s %20s %24s %15s %35s\n",
                            this.getReferencia(),
                            this.getDescripcion(),
                            this.getEstado(),
                            this.getCategoria(),
                                "Vence: " + this.getFechaDeCaducidad().toString());
    }
  
}
