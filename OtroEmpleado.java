package com.mycompany.otroempleado;

public class OtroEmpleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public OtroEmpleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public String mostrarSalario() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual < 450000) {
            return "Nombre: " + nombre;
        } else {
            return "Nombre: " + nombre + "\nSalario Mensual: $" + salarioMensual;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public static void main(String[] args) {
        OtroEmpleadoFrame empleadoFrame = new OtroEmpleadoFrame();
        empleadoFrame.setVisible(true);
    }
}

