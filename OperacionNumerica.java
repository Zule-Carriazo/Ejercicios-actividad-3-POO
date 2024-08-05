package com.mycompany.operacionnumerica;

/**
 * Clase para realizar operaciones numéricas como calcular la raíz cuadrada,
 * el cuadrado y el cubo de un número entero positivo.
 */
public class OperacionNumerica {

    private int numero;

    /**
     * Constructor de la clase OperacionNumerica
     * @param numero Parámetro que define el número para las operaciones
     */
    public OperacionNumerica(int numero) {
        this.numero = numero;
    }

    /**
     * Método que calcula y devuelve la raíz cuadrada del número
     * @return Raíz cuadrada del número
     */
    public double calcularRaiz() {
        return Math.sqrt(numero);
    }

    /**
     * Método que calcula y devuelve el cuadrado del número
     * @return Cuadrado del número
     */
    public double calcularCuadrado() {
        return Math.pow(numero, 2);
    }

    /**
     * Método que calcula y devuelve el cubo del número
     * @return Cubo del número
     */
    public double calcularCubo() {
        return Math.pow(numero, 3);
    }

    public static void main(String[] args) {
        // Creación de una instancia de OperacionNumerica con un número de ejemplo
        OperacionNumericaFrame operacion = new OperacionNumericaFrame();
        operacion.show(true);

    }
}
   
