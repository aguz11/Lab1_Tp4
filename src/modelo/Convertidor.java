/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author agus1
 */
public class Convertidor {

    private double num;

    public Convertidor(double num) {
        this.num = num;
    }

    public Convertidor() {
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Convertidor{" + "num=" + num + '}';
    }

    public static double convertirCentigrados(double n) {
        //Variables a usar
        double convTemp, tempTrunc;
        //Calculo de temperatura
        convTemp = (n * 9 / 5) + 32;

        tempTrunc = formatoNumero(convTemp);
        return tempTrunc;
    }

    public static double convertirFahrenheit(double n) {
        //Variables a usar
        double convTemp, tempTrunc;
        //Instancia 
        DecimalFormat df = new DecimalFormat("#.000");
        //Calculo de temperatura
        convTemp = (n - 32) * 5 / 9;
        //Tuncar el decimal a 3 dígitos y parseo a tipo
        tempTrunc = formatoNumero(convTemp);
        return tempTrunc;
    }
    
    //Tuncar los digitos del número
    public static double formatoNumero(double num) {
        double numFormateado;

        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.000");
        numFormateado = Double.parseDouble(df.format(num));
        return numFormateado;
    }
}
