package Exercises;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private ArrayList<Libro> prestamos = new ArrayList<Libro>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (!libros.contains(libro)) {
            System.out.println("El libro no pertenece a la biblioteca");
            return;
        }
        int prestamosDelUsuario = 0;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getTitulo().equals(libro.getTitulo())) {
                prestamosDelUsuario++;
            }
        }
        if (prestamosDelUsuario >= usuario.getMaximoPrestamos()) {
            System.out.println("Se alcanzo el limite de prestamos");
            return;
        }
        libro.prestar();
        prestamos.add(libro);
    }

    public void devolverLibro(Libro libro) {
        if (prestamos.contains(libro)) {
            prestamos.remove(libro);
            libro.devolver();
        } else {
            System.out.println("El libro no estaba prestado");
        }
    }
}