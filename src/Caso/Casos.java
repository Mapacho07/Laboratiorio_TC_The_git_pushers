/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import java.time.LocalDate;
import Victimas.Victima;

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
    private Victima Victima;
    public Casos(String id, String descripcion, Prioridades prioridad, LocalDate fecha, String tipo,Victima Victima) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.fecha = fecha;
        this.Victima = Victima;
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

    public Victima getVictima() {
        return Victima;
    }

}
