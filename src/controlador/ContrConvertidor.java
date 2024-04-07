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
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }

    // convertir
    public static void Convertir() {
        double temp = Double.parseDouble(vc.getjTxtgrados().getName());
        double convTemp = 0.0;
       
        if (vc.getjCbxCambio().getSelectedIndex() == 1) {
            convTemp = (temp * 9 / 5) + 32;
            JOptionPane.showMessageDialog(vc, convTemp);
        }
         System.out.println(temp + convTemp);
    }

    //fin de la clase..
}
