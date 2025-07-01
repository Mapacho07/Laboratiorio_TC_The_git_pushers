/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

/**
 *
 * @author Student
 */
public enum Prioridades {
    ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");

    private final String prioridad;

    Prioridades(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Prioridades{" + "prioridad=" + prioridad + '}';
    }

}
