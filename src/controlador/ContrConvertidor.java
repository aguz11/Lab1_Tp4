/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VistaConvertidor;

/**
 * @author agus1
 */
public class ContrConvertidor {
    
    
     public static void CargarInstancia(VistaConvertidor vc) {
        //pensar? :-) hola mundo
        //Salute sapee
      
    }
    
     //Solo numero para el campo grados
    public static void eventoTxtGradosSoloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != evt.VK_BACK_SPACE && c != evt.VK_DELETE) {
            evt.consume();
        }
    }
    
    
    //fin de la clase..
}
