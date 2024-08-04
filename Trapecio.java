package com.mycompany.pruebafiguras;

/**
 * Clase que representa un trapecio.
 */
public class Trapecio {
    double baseMayor; // Atributo que define la base mayor de un trapecio
    double baseMenor; // Atributo que define la base menor de un trapecio
    double altura; // Atributo que define la altura de un trapecio
    double lado1; // Atributo que define el primer lado no paralelo de un trapecio
    double lado2; // Atributo que define el segundo lado no paralelo de un trapecio
    
    /**
     * Constructor de la clase Trapecio
     * @param baseMayor Parámetro que define la base mayor de un trapecio
     * @param baseMenor Parámetro que define la base menor de un trapecio
     * @param altura Parámetro que define la altura de un trapecio
     * @param lado1 Parámetro que define el primer lado no paralelo de un trapecio
     * @param lado2 Parámetro que define el segundo lado no paralelo de un trapecio
     */
    Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
     * Método que calcula y devuelve el área de un trapecio
     * como ((baseMayor + baseMenor) / 2) * altura
     * @return Área de un trapecio
     */
    double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }
    
    /**
     * Método que calcula y devuelve el perímetro de un trapecio
     * sumando todos sus lados
     * @return Perímetro de un trapecio
     */
    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}

