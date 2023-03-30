/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.entidades;

/**
 *
 * @author Colo
 */
public class Libro {

    public String ISBN;
    public String Título;
    public String Autor;
    public int NúmeroDePaginas;

    public Libro(String ISBN, String Título, String Autor, int NúmeroDePaginas) { //Constructor con todos los atributos
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NúmeroDePaginas = NúmeroDePaginas;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", N\u00fameroDePaginas=" + NúmeroDePaginas + '}';
    }
}
