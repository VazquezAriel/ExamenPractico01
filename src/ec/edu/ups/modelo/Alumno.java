/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ariel
 */
public class Alumno extends Persona{
    
    private Map<Actividad, Double> calificaciones;
    private Long promedio;

    public Alumno() {
        calificaciones = new HashMap<Actividad, Double>();
    }

    public Alumno(int id, String nombre, String apellido, int edad, String genero, String cedula) {
        super(id, nombre, apellido, edad, genero, cedula);
        calificaciones = new HashMap<Actividad, Double>();
    }

    public Map getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Long getPromedio() {
        return promedio;
    }

    public void setPromedio(Long promedio) {
        this.promedio = promedio;
    }
}
