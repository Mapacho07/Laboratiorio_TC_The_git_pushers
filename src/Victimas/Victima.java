/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victimas;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Student
 */
public class Victima {
    private String Cedula;
    private String Nombre;
    private LocalDate FechaNacimiento;
    public static final String MASCULINO="M", FEMENINO="F";
    private String genero;
    private String Correo;
    private String Telefono;
    private String Direccion;

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Victima(String Cedula, String Nombre, LocalDate FechaNacimiento, String genero, String Correo, String Telefono, String Direccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.genero = genero;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }
    
    public int CalcularEdad(LocalDate FechaNacimiento){
        return Period.between(FechaNacimiento, LocalDate.now()).getYears();
    }
}
