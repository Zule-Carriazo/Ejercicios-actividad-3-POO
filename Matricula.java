/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricula;

/**
 *
 * @author zuzul
 */
public class Matricula {

    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;
    private final double VALOR_CONSTANTE = 50000.0;

    public Matricula(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double calcularPagoMatricula() {
        double incremento = 0.0;
        if (patrimonio > 2000000 && estratoSocial > 3) {
            incremento = patrimonio * 0.03;
        }
        return VALOR_CONSTANTE + incremento;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public static void main(String[] args) {
        MatriculaFrame matricula = new MatriculaFrame();
        matricula.show(true);
    }
}


