/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
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
        vc.getjCbxCambio().addItem("Convertir de °C a °F");
        vc.getjCbxCambio().addItem("Convertir de °F a ºC");
    }

    //Solo numero para el campo grados
    public static void eventoTxtGradosSoloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
            evt.consume();
        }
    }

    // convertir el campo textField 
    public static void Convertir() {
        int comboIndex;
        double tempConv, userTemp;
        if (vc.getjCbxCambio().getSelectedIndex() > 0) {
            //Instancia de la clase Convertidor
            modelo.Convertidor v = new modelo.Convertidor();

            try {
                String valor = vc.getjTxtgrados().getText();
                if (!valor.isEmpty()) {
                    //Se toma el valor del jTxtField y se setea su valor en el atributo 
                    userTemp = Double.parseDouble(valor);

                    v.setNum(userTemp);

                    //TODO: Queda hacer la converción y mostrar los JOptionPane
                    //de C a F (temp °C × 9/5) + 32
                    //de F a C (temp °F − 32) × 5/9
                    //Truncar el valor decimal a tres dígitos
                    DecimalFormat df = new DecimalFormat("#.000");

                    //Se recupera el indice de la selección del combo
                    comboIndex = vc.getjCbxCambio().getSelectedIndex();

                    switch (comboIndex) {

                        case 1 -> {

                            tempConv = (v.getNum() * 9 / 5) + 32;
                            JOptionPane.showMessageDialog(vc, "La temperatura convertida es: " + df.format(tempConv) + "°F.");
                            break;

                        }
                        case 2 -> {
                            tempConv = (v.getNum() - 32) * 5 / 9;
                            JOptionPane.showMessageDialog(vc, "La temperatura convertida es: " + df.format(tempConv) + "°C.");
                            break;
                        }

                    }
                    resetComboB();
                } else {
                    JOptionPane.showMessageDialog(vc, "Debes ingresar un número.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(vc, "Ocurrio una falla inisperada.");
            }
        }
    }

    private  static void resetComboB(){
        vc.getjCbxCambio().setSelectedIndex(0);
    }
//fin de la clase..
}
