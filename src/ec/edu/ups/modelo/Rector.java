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
public class Rector extends Persona{
    
    private String usuario;
    private String contraseña;
    private String institucion;
    private Set<Docente> docentes;
    private Set<Curso> cursos;

    public Rector() {
        docentes = new HashSet<Docente>();
        cursos = new HashSet<Curso>();
    }

    public Rector(String usuario, String contraseña, String institucion, int id, String nombre, String apellido, int edad, String genero, String cedula) {
        super(id, nombre, apellido, edad, genero, cedula);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.institucion = institucion;
        
        docentes = new HashSet<Docente>();
        cursos = new HashSet<Curso>();
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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Set<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(Set<Docente> docentes) {
        this.docentes = docentes;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
