/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import ec.edu.ups.modelo.Rector;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ControladorRector extends ControladorGenerico<Rector> {
    
    private Rector rectorLogeado;

    public Rector getRectorLogeado() {
        return rectorLogeado;
    }

    public List<Rector> buscarPorId(int id) {
        ArrayList<Rector> rectoresEncontrados = new ArrayList<>();
        getListado().stream().filter(r -> r.getId() == id).forEach(r -> rectoresEncontrados.add(r));
        return rectoresEncontrados;
    }
    
    public List<Rector> buscarPorInstitucion(String institucion) {
        ArrayList<Rector> rectoresEncontrados = new ArrayList<>();
        getListado().stream().filter(r -> r.getInstitucion().equals(institucion)).forEach(r -> rectoresEncontrados.add(r));
        return rectoresEncontrados;
    }
    
    public List<Rector> buscarPorCedula(String cedula) {
        ArrayList<Rector> rectoresEncontrados = new ArrayList<>();
        getListado().stream().filter(r -> r.getCedula().equals(cedula)).forEach(r -> rectoresEncontrados.add(r));
        return rectoresEncontrados;
    }
    
    public List<Rector> buscarPorNombre(String nombre) {
        ArrayList<Rector> rectoresEncontrados = new ArrayList<>();
        getListado().stream().filter(r -> r.getNombre().equals(nombre)).forEach(r -> rectoresEncontrados.add(r));
        return rectoresEncontrados;
    }
    
    public List<Rector> buscarPorApellido(String apellido) {
        ArrayList<Rector> rectoresEncontrados = new ArrayList<>();
        getListado().stream().filter(r -> r.getApellido().equals(apellido)).forEach(r -> rectoresEncontrados.add(r));
        return rectoresEncontrados;
    }
    
    public boolean validar(String usuario, String contraseña) {
        for (Rector rector : getListado()) {
            if (rector.getUsuario().equals(usuario) && rector.getContraseña().equals(contraseña)) {
                rectorLogeado = rector;
                return true;
            }
        }
        return false;
    }
}
