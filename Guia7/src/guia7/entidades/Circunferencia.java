/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Colo
 */
public class Circunferencia {
    double radio;

    public Circunferencia(double radio) {
        /** Constructor de una circunferencia con un r parámetro*/
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        Circunferencia circ = new Circunferencia(getRadio());
        return circ;
    }

    public double area(double radio) {
        radio = this.radio;
        return Math.pow((PI * radio), 2);
    }

    public double perimtero(double radio) {
        radio = this.radio;
        return (PI * radio * 2);
    }
}

