/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador_social;

/**
 *
 * @author Student
 */
public class Trabajador_social {
     private String Cedula;
    private String Nombre;
    private String Correo;
    private String Telefono;
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

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Trabajador_social(String Cedula, String Nombre, String Correo, String Telefono, String Canton) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Canton = Canton;
    }

    @Override
    public String toString() {
        return "Trabajador_social{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Canton=" + Canton + '}';
    }

    
}
