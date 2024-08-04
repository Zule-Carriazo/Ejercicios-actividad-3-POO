package com.mycompany.pruebafiguras;

/**
 * Clase que representa un rombo.
 */
public class Rombo {
    double diagonalMayor; // Atributo que define la diagonal mayor de un rombo
    double diagonalMenor; // Atributo que define la diagonal menor de un rombo
    double lado; // Atributo que define la longitud del lado de un rombo
    
    /**
     * Constructor de la clase Rombo
     * @param diagonalMayor Parámetro que define la diagonal mayor de un rombo
     * @param diagonalMenor Parámetro que define la diagonal menor de un rombo
     * @param lado Parámetro que define la longitud del lado de un rombo
     */
    Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    
    /**
     * Método que calcula y devuelve el área de un rombo
     * como (diagonalMayor * diagonalMenor) / 2
     * @return Área de un rombo
     */
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    /**
     * Método que calcula y devuelve el perímetro de un rombo
     * como 4 veces la longitud del lado
     * @return Perímetro de un rombo
     */
    double calcularPerimetro() {
        return 2 * lado + diagonalMenor + diagonalMayor;
    }
}

