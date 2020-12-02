/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Docente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ControladorCurso extends ControladorGenerico<Curso>{
    
    public List<Curso> buscarPorId(int id) {
        ArrayList<Curso> cursosEncontrados = new ArrayList<>();
        getListado().stream().filter(c -> c.getId() == id).forEach(c -> cursosEncontrados.add(c));
        return cursosEncontrados;
    }
    
    public List<Curso> buscarPorNombre(String nombre) {
        ArrayList<Curso> cursosEncontrados = new ArrayList<>();
        getListado().stream().filter(c -> c.getNombre().equals(nombre)).forEach(c -> cursosEncontrados.add(c));
        return cursosEncontrados;
    }
    
    public List<Curso> getCursosDe(Docente docente) {
        ArrayList<Curso> cursosEncontrados = new ArrayList<>();
        getListado().stream().filter(c1 -> c1.getDocente() != null).filter(c -> c.getDocente().equals(docente)).forEach(c -> cursosEncontrados.add(c));
        return cursosEncontrados;
    }
    
}
