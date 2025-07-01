/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public class Persona {
    protected String Nombre;
    protected String Correo;
    protected String Telefono;

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Persona(String Nombre, String Correo, String Telefono) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Correo=" + Correo + ", Telefono=" + Telefono + '}';
    }
    
    
}
