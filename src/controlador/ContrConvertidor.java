/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import vista.VistaConvertidor;

/**
 * @author agus1
 */
public class ContrConvertidor {

    //Se realiza instancia de la vista
    public static VistaConvertidor vc;

    public static void CargarInstancia(VistaConvertidor v) {
        vc = v;
    }

    //Se Carga Combo
    public static void cargarCombo() {
        vc.getjCbxCambio().addItem("Seleccionar una opción");
        vc.getjCbxCambio().addItem("°C a °F");
        vc.getjCbxCambio().addItem("°F a ºC");
    }

    //Solo numero para el campo grados
    public static void eventoTxtGradosSoloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
            evt.consume();
        }
    }

    // convertir
    public static void Convertir() {
        modelo.Convertidor v = new modelo.Convertidor();
        v.setNum(Double.parseDouble(vc.getjTxtgrados().getText()));
        
        //System.out.println(v.getNum());
        
        //TODO: Queda hacer la converción y mostrar los JOptionPane
        //de C a F (temp °C × 9/5) + 32
        //de F a C (temp °F − 32) × 5/9
    }

    //fin de la clase..
}
