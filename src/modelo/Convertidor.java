/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

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
    //Método para convertir a centigrados
    public static double convertirCentigrados(double n){
        //Variables a usar
        double convTemp, tempTrunc;
        //Instancia 
        DecimalFormat df = new DecimalFormat("#.000");
        //Calculo de temperatura
        convTemp = ( n *9/5)+32;
        //Tuncar el decimal a 3 dígitos y parseo a tipo
        tempTrunc = Double.parseDouble(df.format(convTemp));
        return tempTrunc;
    }
    //Método para convertir a Fahrenheit
    public static double convertirFahrenheit(double n){
        //Variables a usar
        double convTemp, tempTrunc;
        //Instancia 
        DecimalFormat df = new DecimalFormat("#.000");
        //Calculo de temperatura
        convTemp = (n - 32) * 5/9;
        //Tuncar el decimal a 3 dígitos y parseo a tipo
        tempTrunc = Double.parseDouble(df.format(convTemp));
        return tempTrunc;
    }

}
