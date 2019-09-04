/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author julian
 */
public class Archivo {
    private ArrayList<String> tokens = new ArrayList<String>();
    Scanner sc;

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public void fileToString(String filePath) {
        try {
            sc = new Scanner(new File(getClass().getResource(filePath).getPath()));
            while (sc.hasNext()) {
                tokens.addAll(Arrays.asList(sc.nextLine().split(" ")));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public void verificarPalabra(String palabra){
//        int inicio = 0;
//        if (Character.isLetter(palabra.charAt(0))){
//            for(int i=0;i<palabra.length();i++)
//                if(!Character.isLetter(palabra.charAt(i)) && !Character.isDigit(palabra.charAt(i))){
//                    String subToken = palabra.substring(inicio, i-1);
//                    tokens.add(subToken);
//                    inicio = i;
//                }
//        
//        }
//    }
//    
//    public void verificarString (String palabra){
//        
//    }
}
