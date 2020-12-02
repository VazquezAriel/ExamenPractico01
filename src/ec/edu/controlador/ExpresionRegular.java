/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ariel
 */
public class ExpresionRegular {
    
    private Pattern patron;
    private Matcher corpus;
    
    public List<String> obtenerNombresPropios(String texto) {
        List<String> resultado = new ArrayList<>();
        corpus = patron.matcher(texto);
        while (corpus.find()) {
            for (int i = 0; i < corpus.groupCount(); i++) {
                resultado.add(corpus.group(0));
            }
        }
        return resultado;
    }
    
    public Set<String> obtenerUrlGoogle(String paginaTexto) {
        Set<String> resultado = new HashSet();
        corpus = patron.matcher(paginaTexto);
        while (corpus.find()) {
            resultado.add(corpus.group(0));
        }
        return resultado;
    }
    
    public void ingresarRegex(String regex) {
        patron = Pattern.compile(regex);
    }
    
    public boolean validar(String texto) {
        corpus = patron.matcher(texto);
        return corpus.find();
    }

    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
    
    
    
}
