/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

import Archivo.Archivos;
import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class Analizador {
    
    private ArrayList<String> tokens;
    private Archivos archivo;
    private String palabrasReservadas[] = {"#include","<iostream>","using",
                                            "namespace","char","void","int"};

    public Analizador() {
        tokens = new ArrayList<String>();
        archivo = new Archivos();
    }
    
    public 
}
