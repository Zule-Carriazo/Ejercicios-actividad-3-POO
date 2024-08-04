/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.compararnumero;

public class CompararNumero {

    private double a;
    private double b;

    public CompararNumero(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String comparar() {
        if (a > b) {
            return "A es mayor que B";
        } else if (a == b) {
            return "A es igual que B";
        } else {
            return "A es menor que B";
        }
    }

    // Getters y Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        CompararNumeroFrame compararNumero = new CompararNumeroFrame();
        compararNumero.show(true);
    }
}

