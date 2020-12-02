/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import ec.edu.ups.modelo.Docente;

/**
 *
 * @author ariel
 */
public class ControladorDocente extends ControladorGenerico<Docente>{
    
    private Docente docenteLogeado;

    public Docente getDocenteLogeado() {
        return docenteLogeado;
    }
    
    public boolean validar(String usuario, String contraseña) {
        for (Docente docente : getListado()) {
            if (docente.getUsuario().equals(usuario) && docente.getContraseña().equals(contraseña)) {
                docenteLogeado = docente;
                return true;
            }
        }
        return false;
    }
    
}
