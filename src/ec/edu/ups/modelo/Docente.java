/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ariel
 */
public class Docente extends Persona{
    
    private String usuario;
    private String contraseña;
    private List<Actividad> actividades;
    

    public Docente() {
        actividades = new ArrayList<>();
    }

    public Docente(String usuario, String contraseña, int id, String nombre, String apellido, int edad, String genero, String cedula) {
        super(id, nombre, apellido, edad, genero, cedula);
        this.usuario = usuario;
        this.contraseña = contraseña;
        actividades = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public void AgregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }
    
    public Actividad buscarActividad(String nombre) {
        for (Actividad actividad : actividades) {
            if (actividad.getNombre().equals(nombre)) {
                return actividad;
            }
        }
        return null;
    }
    
    public boolean actualizarActividad(Actividad a, String nombre, String descripsion) {
        for (Actividad actividad : actividades) {
            if (actividad.equals(a)) {
                actividad.setNombre(nombre);
                actividad.setDescripcion(descripsion);
                actividades.set(actividades.indexOf(a), actividad);
                return true;
            }
        }
        return false;
    }
    
}
