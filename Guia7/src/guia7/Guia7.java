/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import guia7.entidades.Circunferencia;
import guia7.entidades.Libro;
import guia7.entidades.Persona;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Colo
 */
public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        teoría();
        Ejercicio1();
    }

    public static void teoría() {
        Persona persona1 = new Persona("Daniel Hernández", "22600627", LocalDate.of(1972, Month.FEBRUARY, 6));
        System.out.println(persona1.toString());
    }

    public static void Ejercicio1() {
        Libro L1 = new Libro("123456798", "No Cazo Una", "Juan de los Palotes" ,128);
        Libro L2 = new Libro("456789651","Manual del no entiendo","Juan Pelotas",230);
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        //System.out.println("ISBN: " + L1.ISBN + "\nAutor: " + L1.Autor + "\nTítulo: " + L1.Título + "\nNúmero de páginas: " + L1.NúmeroDePaginas) ;
    }
    public void Ejercicio2(){
    //Declarar una clase llamada Circunferencia que tenga como atributo 
    //privado el radio de tipo real. A continuación, se deben crear los 
    //siguientes métodos:
    //Método constructor que inicialice el radio pasado como parámetro.
    //Métodos get y set para el atributo radio de la clase Circunferencia.
    //Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    //Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    //Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
        Circunferencia Circ1 = new Circunferencia(5.3);
        
    }
}
