
package com.mycompany.pruebafiguras;

public class Triangulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }
/**
* Método que calcula y devuelve el perímetro de un triángulo
* rectángulo como la suma de la base, la altura y la hipotenusa
* @return Perímetro de un triángulo rectángulo
*/
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al
método calcular hipotenusa */
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
/**
* Método que determina si un triángulo es:
* - Equilatero: si sus tres lados son iguales
* - Escaleno: si sus tres lados son todos diferentes
* - Escaleno: si dos de sus lados son iguales y el otro es diferente de
* los demás
*/
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); 
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); 
        else
            System.out.println("Es un triángulo isósceles");
    }
    
}
