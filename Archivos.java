/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Archivos {

    private ArrayList<String> tokens = new ArrayList<String>();

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public void fileToArray(String filePath) {
        int fila = 0;
        String[] linea;
        String[] tokensLinea;
        try {
            Scanner sc = new Scanner(new File(getClass().getResource(filePath).getPath()));
            while (sc.hasNext()) {
                linea = sc.nextLine().split(" ");
                for (int i = 0; i < linea.length; i++) {
                    for (int j = 0; j < linea[i].length(); j++) {
                        tokensLinea = null;
                        if (!Character.isDigit(linea[i].charAt(j)) && !Character.isLetter(linea[i].charAt(j))) {
                            tokensLinea = linea[i].split((linea[i].charAt(j)));
                        }
                        if(tokensLinea!=null){
                            tokens.add(tokensLinea[0]);
                            linea[i] = tokensLinea[1];
                        }
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void analizarPalabra(String palabra){
        
    }
}
