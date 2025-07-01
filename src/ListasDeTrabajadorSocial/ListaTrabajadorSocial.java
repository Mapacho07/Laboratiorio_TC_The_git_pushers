/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDeTrabajadorSocial;
import MetodosGenericos.MetodoGenerico;
import Trabajador_social.Trabajador_social;

/**
 *
 * @author Student
 */
public class ListaTrabajadorSocial implements MetodoGenerico<Trabajador_social> {
   private final Trabajador_social[] listaTrabajador;
    private int count;

    public ListaTrabajadorSocial(int size) {
        listaTrabajador = new Trabajador_social[size];
        count = 0;
    }
    
    
    @Override
    public boolean Agregar(Trabajador_social t) {
         if (count >= listaTrabajador.length) {
            return false;
        }
        listaTrabajador[count++] = t;
        return true;
    }

    @Override
    public boolean Eliminar(Trabajador_social t) {
        for (int i = 0; i < count; i++) {
            if (listaTrabajador[i].getCedula().equals(t.getCedula())) {
                for (int j = i; j < count - 1; j++) {
                    listaTrabajador[j] = listaTrabajador[j + 1];
                }
                listaTrabajador[--count] = null;
                return true;
            }
        }
       return false;
    }

    @Override
    public Trabajador_social Buscar(Object id) {
        String cedulaBuscada = (String) id;
        for (int i = 0; i < count; i++) {
            if (listaTrabajador[i].getCedula().equals(cedulaBuscada)) {
                return listaTrabajador[i];
            }
        }
        return null;
    }
    
    
}
