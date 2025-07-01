/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victimas;

import java.time.LocalDate;
import java.time.Period;
import Personas.Persona;
/**
 *
 * @author Student
 */
public class Victima extends Persona {
    private int Cedula;
    private LocalDate FechaNacimiento;
    public static final String MASCULINO="M", FEMENINO="F";
    private String genero;
    private String Direccion;

    public int getCedula() {
        return Cedula;
    }

    public int getNombre() {
        return Nombre.hashCode();
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Victima(String Cedula, LocalDate FechaNacimiento, String genero, String Direccion, String Nombre, String Correo, String Telefono) {
        super(Nombre, Correo, Telefono);
        this.Cedula = Cedula.hashCode();
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.genero = genero;
        this.Direccion = Direccion;
    }

    public int CalcularEdad(LocalDate FechaNacimiento){
        return Period.between(FechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Victima{" + "Cedula=" + Cedula + ", FechaNacimiento=" + FechaNacimiento + ", genero=" + genero + ", Direccion=" + Direccion + '}';
    }
    
}
