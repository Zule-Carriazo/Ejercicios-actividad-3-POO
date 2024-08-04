
package com.mycompany.empleado;

/**
 *
 * @author zuzul
 */
public class Empleado {
    // Atributos
    private String codigo;
    private String nombre;
    private int horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;
    
    // Constructor
    public Empleado(String codigo, String nombre, int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // Método para calcular el salario bruto 
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }
    // Método para calcular el salario neto
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto * (1 - porcentajeRetencion / 100);
    }

   
    // Método principal para probar la clase
    public static void main(String[] args) {
        EmpleadoFrame Empleados=new  EmpleadoFrame();
        Empleados.show(true);
    }
}





