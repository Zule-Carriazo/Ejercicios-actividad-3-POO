/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacionsegundogrado;


public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones son x1 = " + x1 + " y x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "La solución es x = " + x;
        } else {
            return "La ecuación no tiene soluciones reales.";
        }
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static void main(String[] args) {
        // Para pruebas rápidas sin interfaz gráfica
        EcuacionSegundoGradoFrame  ecuacion = new EcuacionSegundoGradoFrame ();
        ecuacion.show(true);
    }
}

