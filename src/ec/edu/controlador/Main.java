/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ariel
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException {

        String url = "<a\\shref=\"(http(s)?\\:\\/\\/)(www)?(.[^\"\\s])+";
        
        ExpresionRegular expresionRegular = new ExpresionRegular();
        expresionRegular.ingresarRegex("https://play.google.com/store/apps/details?id=com.");
        StringBuilder stringBuilder = new StringBuilder();

        String busqueda = "Maicraft";
        try {
            URL urlObject = new URL("https://play.google.com/store/search?q=" + busqueda.replaceAll("\\s", "\\+"));
            URLConnection urlConnection = urlObject.openConnection();
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            String inputLine;
            
            while ((inputLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Set<String> resultado = expresionRegular.obtenerUrlGoogle(stringBuilder.toString());
        resultado.stream().forEach(s -> System.out.println(s));
    }

}
