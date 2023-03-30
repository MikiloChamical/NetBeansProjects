/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.entidades;

import java.time.LocalDate;

/**
 *
 * @author Colo
 */
public class Persona {
    String nombre;
    String DNI;
    LocalDate fechaNacimiento;

    public Persona(String nombre, String DNI, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nNombre= " + nombre + "\nDNI= " + DNI + "\nFecha de Nacimiento= " + fechaNacimiento + "\n" ;
    }
}
