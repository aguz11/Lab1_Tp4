/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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

    
    

}
