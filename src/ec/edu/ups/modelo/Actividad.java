/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author ariel
 */
public class Actividad implements Serializable{
    
    private String nombre;
    private String descripcion;
    private Map<String, String> app;

    public Actividad() {
        app = new HashMap<String, String>();
    }

    public Actividad(String nombre) {
        this.nombre = nombre;
    }

    public Actividad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        app = new HashMap<String, String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<String, String> getApp() {
        return app;
    }

    public void setApp(Map<String, String> app) {
        this.app = app;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nombre);
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
        final Actividad other = (Actividad) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    public void obtenerApps() {
        
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
