
package com.mycompany.trianguloequilatero;

/**
 *
 * @author zuzul
 */
public class TrianguloEquilatero {
    // Atributo
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * lado;
    }
    // Método para calcular la altura 
    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }
    // Método para calcular el área
    public double calcularArea() {
        double altura = calcularAltura();
        return (lado * altura) / 2;
    }

  
    // Método principal para mostrar clase
    public static void main(String[] args) {
        EquilateroFrame triangulo = new EquilateroFrame();
        triangulo.show(true);
    }
}






