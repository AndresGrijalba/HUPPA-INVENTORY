/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oswal
 */
public class Proveedor extends Persona {
    
    private InformacionDeContacto infocontact;

    public Proveedor(InformacionDeContacto infocontact, String nombre, String id) {
        super(nombre, id);
        this.infocontact = infocontact;
    }

    public InformacionDeContacto getInfocontact() {
        return infocontact;
    }

    public void setInfocontact(InformacionDeContacto infocontact) {
        this.infocontact = infocontact;
    }

    
}

    
