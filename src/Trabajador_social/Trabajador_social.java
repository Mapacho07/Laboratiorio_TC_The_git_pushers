/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador_social;

import Personas.Persona;
/**
 *
 * @author Student
 */
public class Trabajador_social extends Persona {
    private String Cedula;
    private String Canton;

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCanton() {
        return Canton;
    }

    public Trabajador_social(String Canton, String Cedula, String Nombre, String Correo, String Telefono) {
        super(Nombre, Correo, Telefono);
        this.Cedula= Cedula;
        this.Canton = Canton;
    }

    

    @Override
    public String toString() {
        return "Trabajador_social{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Canton=" + Canton + '}';
    }

    
}
