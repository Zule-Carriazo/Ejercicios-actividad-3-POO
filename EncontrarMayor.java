package com.mycompany.encontrarmayor;

/**
 * Clase para encontrar el mayor valor entre un grupo de números enteros positivos.
 */
public class EncontrarMayor {
    
    private int[] numeros;

    /**
     * Constructor de la clase EncontrarMayor
     * @param numeros Parámetro que define el grupo de números enteros positivos
     */
    public EncontrarMayor(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * Método que encuentra y devuelve el mayor valor entre el grupo de números
     * @return El mayor valor entre los números
     */
    public int encontrarMayorValor() {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El grupo de números no puede estar vacío.");
        }

        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        int[] grupoNumeros = {5, 8, 3, 12, 7, 1};
        EncontrarMayorFrame encontrar = new EncontrarMayorFrame();
        encontrar.show(true);

    }
}

