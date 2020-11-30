/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ariel
 */
public class Curso {
    
    private int id;
    private String nombre;
    private Set<Actividad> actividades;
    private Set alumnos;

    public Curso() {
        actividades = new HashSet<Actividad>();
        alumnos = new HashSet<Alumno>();
    }
    
    

    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        actividades = new HashSet<Actividad>();
        alumnos = new HashSet<Alumno>();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
