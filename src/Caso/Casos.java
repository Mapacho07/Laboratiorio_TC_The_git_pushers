/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Casos {

    private String id;
    private String descripcion;
    private Prioridades prioridad;
    private LocalDate fecha;
    private String tipo;

    public Casos(String id, String descripcion, Prioridades prioridad, LocalDate fecha, String tipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Prioridades getPrioridad() {
        return prioridad;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

}
