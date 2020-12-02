/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class Curso implements Serializable{
    
    private int id;
    private String nombre;
    private Docente docente;
    private List<Actividad> actividades;
    private List<Alumno> alumnos;

    public Curso() {
        actividades = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public Curso(int id) {
        this.id = id;
        actividades = new ArrayList<>();
        alumnos = new ArrayList<>();
    }
    
    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        actividades = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public Curso(int id, String nombre, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
        alumnos = new ArrayList<>();
        actividades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public Docente getDocente() {
        return docente;
    }
    
    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }
    
    public void agregarAlumno (Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
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
